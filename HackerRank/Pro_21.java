package HackerRank;


import java.util.Scanner;
import java.util.regex.*;

public class Pro_21 {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String pattern = in.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("valid");
                }
                catch (Exception e){
                    System.out.println("invalid");
                }

                testCases--;
            }


            for (char ch='A'; ch<='Z'; ch++){
                System.out.print(ch+" ");
            }

        }
    }

