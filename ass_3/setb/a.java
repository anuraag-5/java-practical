package ass_3.setb;

import java.io.*;
import java.util.Scanner;

public class a {
    private static final String FNAME = "book.dat";

    static void writeRecords() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books to enter? ");
        int n = Integer.parseInt(sc.nextLine().trim());
        try (RandomAccessFile raf = new RandomAccessFile(FNAME, "rw")) {
            raf.setLength(0); // clear file
            for (int i = 0; i < n; i++) {
                System.out.printf("Book %d id: ", i+1);
                int id = Integer.parseInt(sc.nextLine().trim());
                System.out.print("Book name: ");
                String name = sc.nextLine().trim();
                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Quantity: ");
                int qty = Integer.parseInt(sc.nextLine().trim());
                // write as a record: id int, name utf, price double, qty int
                raf.writeInt(id);
                raf.writeUTF(name);
                raf.writeDouble(price);
                raf.writeInt(qty);
            }
        }
    }

    static void displayAll() throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(FNAME, "r")) {
            raf.seek(0);
            System.out.println("ID\tName\tPrice\tQty\tTotal");
            double grandTotal = 0;
            while (raf.getFilePointer() < raf.length()) {
                int id = raf.readInt();
                String name = raf.readUTF();
                double price = raf.readDouble();
                int qty = raf.readInt();
                double total = price * qty;
                grandTotal += total;
                System.out.printf("%d\t%s\t%.2f\t%d\t%.2f%n", id, name, price, qty, total);
            }
            System.out.printf("Grand Total cost of all books = %.2f%n", grandTotal);
        }
    }

    static void searchByName(String target) throws IOException {
        boolean found = false;
        try (RandomAccessFile raf = new RandomAccessFile(FNAME, "r")) {
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                int id = raf.readInt();
                String name = raf.readUTF();
                double price = raf.readDouble();
                int qty = raf.readInt();
                if (name.equalsIgnoreCase(target)) {
                    System.out.println("Found: ID=" + id + ", Name=" + name + ", Price=" + price + ", Qty=" + qty);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Book named '" + target + "' not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1) Enter book records (overwrite)");
                System.out.println("2) Display all books and total cost");
                System.out.println("3) Search book by name");
                System.out.println("4) Exit");
                System.out.print("Choice: ");
                int ch = Integer.parseInt(sc.nextLine().trim());
                if (ch == 1) writeRecords();
                else if (ch == 2) displayAll();
                else if (ch == 3) {
                    System.out.print("Enter book name to search: ");
                    String name = sc.nextLine().trim();
                    searchByName(name);
                } else if (ch == 4) {
                    System.out.println("Exiting.");
                    break;
                } else System.out.println("Invalid choice.");
            }
        } catch (IOException ex) {
            System.err.println("File IO error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
