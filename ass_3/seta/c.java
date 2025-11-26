package ass_3.seta;

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source filename: ");
        String src = sc.nextLine().trim();
        System.out.print("Enter destination filename: ");
        String dest = sc.nextLine().trim();
        sc.close();

        Path ps = Paths.get(src), pd = Paths.get(dest);
        try {
            // copy (overwrites if exists)
            byte[] content = Files.readAllBytes(ps);
            Files.write(pd, content);
            // append comment
            String comment = System.lineSeparator() + "end of file";
            Files.write(pd, comment.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Copied and appended successfully.");
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }
}

