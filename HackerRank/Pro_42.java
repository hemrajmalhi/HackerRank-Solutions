package HackerRank;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pro_42 {
    public static  void main (String [] args){
      // first way to find the du
        int [] num= {1,2,3,4,5,6,7,8,9,9};
        Set<Integer> duplicate = new HashSet<>();
//   First Way to find the duplicate Number
        for (int duplicateNum : num){
            if(!duplicate.add(duplicateNum)) {
                System.out.println("duplicate Number :" + duplicateNum);

            }

        }
        System.out.println("No duplicate Number ");

       //Second Way to find the duplicate Number
        Arrays.sort(num);
        for(int i=1; i<num.length;i++){
            if(num[i]==num[i-1]){
                System.out.println("Duplicate Num :" + num[i]);

            }
        }


        int [] arr={23,34,34,4};
         int [] arr1=new int[2];
         System.arraycopy(arr,2,arr1,0,2);
        for (int arr2:arr1) {
            System.out.println(arr2);

        }
        System.out.println(arr.getClass().getName());
    }
}


