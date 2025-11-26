package ass_4;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class p2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source filename: ");
        String srcFile = sc.nextLine();
        System.out.println("Enter destination filename: ");
        String dstFile = sc.nextLine();

        Path src = Paths.get(srcFile), dst = Paths.get(dstFile);

        try {
            byte[] content = Files.readAllBytes(src);
            Files.write(dst, content);
            String commemt = System.lineSeparator() + "end of file";
            Files.write(dst, commemt.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
