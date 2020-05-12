import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

public class ReaderResources {

    public void readRes() {
        try {
            File file = new File(getClass().getClassLoader().getResource("Banks_Statistics_2020.csv").getFile());
            FileReader fr = new FileReader(file, Charset.forName(ReaderFileSystem.CHARSET_NAME));
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            List<String> list = new ArrayList<>();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
            for (String item : list) {
                int rowNum = list.indexOf(item);
                if (rowNum == 0){
                    continue;
                }
                if (rowNum % 2 == 0) {
                    System.out.println(rowNum + " " + item);
                }
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
