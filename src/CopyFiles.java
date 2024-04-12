import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CopyFiles {
    public static void main(String[] args) {


        copy("file 1", "file 2");
    }

    private static void copy(String originalPath, String copyPath) {

        try {
            FileInputStream inputStream = new FileInputStream(originalPath);
            FileOutputStream outputStream = new FileOutputStream(copyPath);
            int i = 0;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
                outputStream.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
