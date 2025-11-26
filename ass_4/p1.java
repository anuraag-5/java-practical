package ass_4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.io.IOException;

public class p1 {
    public static void main(String []args){
        Path p = Paths.get("sample.txt");
        try {
            List<String> lines = Files.readAllLines(p);
            for(String l: lines){
                System.out.println(l.toUpperCase());
            }

            Collections.reverse(lines);
            for(String l: lines){
                System.out.println(l);
            }
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
