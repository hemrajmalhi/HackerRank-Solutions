package HackerRank;
import java.util.*;


public class Pro_7 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();   
            int sum=a;
            int c=1;
            int num=1;
            while(num<=n){
            a=a+c*b;
             System.out.print(a+" ");
              c=c*2;
              num++;
            }     
            System.out.println("");
          
    
        }
        in.close();
    }
}

    

