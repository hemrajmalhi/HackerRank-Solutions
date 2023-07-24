package HackerRank;
import java.util.Scanner;

public class Pro_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int y=s1.length();
            String s2=" ";
            int j=1;
            System.out.print(s1);
            while(j<=15-y){
                System.out.print(s2);
                j++;
            }
            if(x<100 && x>=10){
                System.out.println("0"+x);
            }
            else if(x==0){
                System.out.println("00"+x);
            }
            else{
                System.out.println(x);
            }         
        }
        System.out.print("================================");
    }
}