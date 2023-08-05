package HackerRank;

import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pro_26 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try {
            int x =sc.nextInt();
        int y= sc.nextInt();

            int z=x/y;
            System.out.println(z);

        }
        catch (InputMismatchException e ){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
