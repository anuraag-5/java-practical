package ass_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source filename: ");
        String srcFile = sc.nextLine();

        double totalCost = 0.0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(srcFile));

            String line;

            System.out.println("\n--- All Books ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);    // Display book

                // Split the CSV-style line
                String[] parts = line.split(",");

                // parts[2] = price, parts[3] = qty
                double price = Double.parseDouble(parts[2].trim());
                int qty = Integer.parseInt(parts[3].trim());

                totalCost += price * qty;    // Add to total
            }

            System.out.println("\nTotal Cost of All Books: ₹" + totalCost);

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}