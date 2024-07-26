package HackerRank;

import java.util.Arrays;

public class Pro_33 {
//    public static int SecondHighestNumber(int [] nums){
//        int highest = Integer.MIN_VALUE;
//        int second_highest = Integer.MIN_VALUE;
//
//        for(int num :nums){
//            if(num>highest){
//                second_highest=highest;
//                highest=num;
//            } else if (num >second_highest && num !=highest) {
//                second_highest=num;
//            }
//        }
//        return second_highest;
//    }
    public  static void main(String [] args) {
        System.out.println("this is hemraj malhi");

        int[] arr = {45, 345, 34, 5, 345, 34, 5, 34534, 5, 5, 566, 45, 4, 456};
//
//        int a = SecondHighestNumber(arr);
//        System.out.println(a);
//        int highest = Integer.MIN_VALUE;
//        int secondHighest =Integer.MIN_VALUE;
//        for (int num:arr) {
//            if(num >highest){
//                secondHighest=highest;
//                highest=num;
//            } else if ( num >secondHighest && num !=highest) {
//                secondHighest=num //  }}
//
//        System.out.println(secondHighest);

         Arrays.sort(arr);
         int secondHighestNum=arr[arr.length-2];
        System.out.println(secondHighestNum);



        int num1 =Integer.MIN_VALUE;
        int num2 =Integer.MIN_VALUE;
        for (int num:arr) {
            if(num > num1){
                num2=num1;
                num1=num;
            } else if (num >num2 && num<num1) {
                num2=num;
            }


        }
        System.out.println(num2);



    }

}
