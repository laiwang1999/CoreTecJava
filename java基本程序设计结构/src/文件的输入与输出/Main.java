package 文件的输入与输出;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("myfile.txt", String.valueOf(StandardCharsets.UTF_8));
            out.println("hello");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
