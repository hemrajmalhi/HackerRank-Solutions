package HackerRank;
import java.util.*;

public class Pro_10 { 
     static int B;
     static int H;
     static boolean flag;
     static{
        Scanner scan =new Scanner(System.in);
        B=scan.nextInt();
       H=scan.nextInt();
        
        if (B<=0 || H <=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");     
        }
        else{
            flag=true;
        }
     }

      

public static void main(String[] args){
        if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}



