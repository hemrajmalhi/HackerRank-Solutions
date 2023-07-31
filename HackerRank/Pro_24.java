package HackerRank;
import java.util.*;

public class Pro_24 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int []a =new int[n];
            for (int b=0;b<a.length;b++){
                int num=scan.nextInt();
                a[b]=num;
            }
            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
