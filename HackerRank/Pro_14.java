package HackerRank;

import java.util.Scanner;
import  java.util.Arrays;

public class Pro_14 {
    public static  boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayA);
        return Arrays.equals(charArrayA, charArrayA);
    }
        public static void main(String [] args){
            Scanner str=new Scanner(System.in);
            String a=str.nextLine();
            String b =str.nextLine();


            if (isAnagram(a,b)){
                System.out.println("anagram");
            }
            else {
                System.out.println("not anagram");
            }

        }
    }