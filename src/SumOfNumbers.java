import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SumOfNumbers {
    static FileInputStream in;
    static FileOutputStream on;
    public static void main(String[] args) {
        try {
            in = new FileInputStream("TWO NUMBERS");
            Scanner scanner = new Scanner(in);
            on = new FileOutputStream("SUM OF TWO NUMBERS",true);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            String sum2 = sum  +" ";
            on.write(sum2.getBytes());
            on.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
