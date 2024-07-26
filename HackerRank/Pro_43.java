package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pro_43 {
    public  static void main(String [] args){
//      Sum Of Two Matrices ;
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};

        int c[][] = new int[a.length][b.length];

        for(int i=0; i <a.length; i++ ){
            for(int j=0; j<b.length; j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        // Multiplication Of Two Matrices

        for(int i=0; i <a.length; i++ ){
            for(int j=0; j<b.length; j++){
               c[i][j]=0;
               for(int k =0; k<3;k++){

                   c[i][j]+=a[i][j]*b[i][j];
               }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
       //
         int sum=0;
        Set<Integer> duplicateNum= new HashSet<>();

        int arr[] ={34,4,545,4,434,5,45,4,5,34,3,4,5,4,54};
         for(int f: arr ){
             sum+=f;
         }
        System.out.println("sum of array :" + sum);

       //Find the second Maximum Number
        Arrays.sort(arr);
        System.out.println(arr[arr.length- 2]);




    }






}





