package HackerRank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Pro_30 {



        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

    class MyRegex {
        // Regular expression for validating IP address
        // The pattern checks for 4 groups of numbers (A.B.C.D)
        // Each group can be from 0 to 255 with leading zeros allowed, and the length of each group can't be greater than 3.
        // Note: We need to escape the backslashes in the Java string, so "\\" represents a single backslash in the regular expression.
        String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }

