import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class ReaderResources {

    public void readRes() {
        try {
            File file = new File(getClass().getClassLoader().getResource("Banks_Statistics_2020.csv").getFile());
            FileReader fr = new FileReader(file, Charset.forName(ReaderFileSystem.CHARSET_NAME));
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedCharsetException e) {
            System.out.println("we can't find charset " + e.getMessage());
        }
    }
}
