import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        CharArrayWriter caw = new CharArrayWriter();
        for (String s : words) {
            caw.write(s);
        }
        return caw.toCharArray();
    }
}

