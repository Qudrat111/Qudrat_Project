import java.util.Scanner;
import java.util.logging.Logger;

public class SanaRegex {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the year : ");
        String year = scanner.next();
        boolean yearMatches = year.matches(("\\d{4}"));
        boolean year1 = year(yearMatches, year);
        System.out.print("Enter the month : ");
        String month = scanner.next();
        boolean month1 = month(month);
        System.out.print("Enter the day : ");
        String day = scanner.next();
        boolean day1 = day(day);
        if (year1 && month1 && day1){
            System.out.println(year + "-" + month + "-" + day);
        }


    }

    private static boolean day(String day) {
        boolean dayMatches = day.matches("\\d{2}");
        if(dayMatches){
            if(Integer.valueOf(day) > 0 && Integer.valueOf(day) < 32){
             return true;
            }
        }
        return false;
    }

    private static boolean month(String month) {
        boolean monthMatches = month.matches("\\d{2}");
        if (monthMatches){
            if (Integer.valueOf(month) > 0 && Integer.valueOf(month) < 13){
                return true;
            }
        }
        return  false;
    }

    private static boolean year(boolean matches, String year) {
        if (matches) {
            if (year.startsWith("0")) {
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
}
