package ass_3.seta;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Collections;

public class b {
    public static void main(String []args){
        Path p = Paths.get("sample.txt");

        try {
            List<String> lines = Files.readAllLines(p);
            for(String l: lines){
                System.out.println(l.toUpperCase());
            }

            Collections.reverse(lines);
            for(String l: lines){
                System.out.println(l.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
