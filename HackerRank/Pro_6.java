package HackerRank;
/*
 * Java Loop
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i =1;
        while(i<=10){
    
        System.out.println(N+" X "+i+" = "+N*i);
            i++;
        }
     bufferedReader.close();
    }
}
