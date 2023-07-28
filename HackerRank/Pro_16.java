package HackerRank;
import java.util.Scanner;



public class Pro_16 {
    public static String palindrome(String str) {
        String reverse = "";
        for (int i = 0; i <str.length(); i++) {

            reverse = str.charAt(i) + reverse;
        }
        if (str.equals(reverse)) {
            return "Yes";
        } else {
            return "NO";
        }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
                String A=sc.next().toLowerCase();
                String a =palindrome(A);
                System.out.println(a);

                }

        }



