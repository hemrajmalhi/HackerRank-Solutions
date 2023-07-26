package HackerRank;
import java.time.LocalDate;
import java.util.Scanner;

public class Pro_12 {
        public static String findDay(int month, int day, int year) {
            LocalDate localdate= LocalDate.of(year,month,day);
            return String.valueOf(localdate.getDayOfWeek());

        }
            public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();
            System.out.println(findDay(month,day,year));
        }
    }