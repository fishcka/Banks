import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class ReaderFileSystem {
    public static final String PATHNAME = "C://11java/Banks_Statistics_2020.csv";
    public static final String CHARSET_NAME = "windows-1251";

    public void readFS() {
        try {
            File file = new File(PATHNAME);
            FileReader fr = new FileReader(file, Charset.forName(CHARSET_NAME));
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found " + PATHNAME);
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (UnsupportedCharsetException e) {
            System.out.println("we can't find charset " + e.getMessage());
        }
    }
}
