import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class Main {
    public static void main(String[] args) {
        String pathname = "C://11java/Banks_Statistics_2020.csv";
        String charsetName = "windows-1251";
        try {
            File file = new File(pathname);
            FileReader fr = new FileReader(file, Charset.forName(charsetName));
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found " + pathname);
        }catch (IOException e) {
            e.printStackTrace();
        }catch (UnsupportedCharsetException e) {
            System.out.println("we can't find charset " + e.getMessage());
        }
    }
}