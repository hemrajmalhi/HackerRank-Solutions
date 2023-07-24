package HackerRank;

import java.util.Scanner;


public class Pro_9{
    public static void main(String[] args) {
        Scanner scan =new   Scanner (System.in);
        int i=1;
        while (scan.hasNext()) {  
// hasNext take a boolean value mean when press the enter it go for a next input.until condition is not false.
            String str=scan.nextLine();
            System.out.println(i+" "+ str);
            i++;
        }
        scan.close();


        
    }
}