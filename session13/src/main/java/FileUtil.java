import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
* Assignment 2
* Provide a solution that allows you to customize the marked block in the following code
* snippet in an functional way. Prove the flexibility by writing a method for returning all
* lines of a file that are starting with an uppercase letter and another one that returns
* a list of all words of a file
* */


public class FileUtil {

    public static List<String> getAllLinesOfFile(String fileName) {
        try(FileInputStream fis = new FileInputStream(new File(fileName));
            BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {

            // from here
            List<String> lines = new ArrayList<String>();
            String line = null;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            return lines;
            // until here
// exception handling again

        } catch(IOException e) {
            throw new RuntimeException("Error occurred", e);
        }
    }
}