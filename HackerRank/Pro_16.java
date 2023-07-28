package HackerRank;
import java.util.Scanner;



public class Pro_16 {
    public static String palindrome1(String str) {
        String reverse = "";
        for (int i = 0; i <str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        if (str.equals(reverse))
            return "Yes";
        else
            return "NO";
        }

         public  static String palindrome2(String str){
         StringBuilder stringBuilder=new StringBuilder();
         stringBuilder.append(str).reverse();
         if (str.equals(stringBuilder))
             return "Yes";
         else
             return "No";

        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
                String A=sc.next().toLowerCase();
                String a =palindrome1(A);
                String b =palindrome2(A);
                System.out.println(a);
                System.out.println(b);


                }

        }



