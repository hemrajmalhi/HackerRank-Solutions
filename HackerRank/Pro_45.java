package HackerRank;


public class Pro_45 {

   static String ConcatWithString(){
       String t="java";
       for(int i=0;i<10;i++){
             t= t + "point";
       }

       return t;
   }
    static String ConcatWithStringBuffer(){
         StringBuffer stringBuffer=new StringBuffer("java");

        for(int i=0;i<10;i++){
            stringBuffer.append("point");
        }

        return stringBuffer.toString();
    }


    static boolean PalindromeChecker(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        String sbb = sb.toString();
        if (str.equals(sbb)) {
          return true;
        }
        else {
          return false;
        }

    }
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();
        ConcatWithString();
        System.out.println(System.currentTimeMillis()-startTime+ " ms");
        startTime = System.currentTimeMillis();
        ConcatWithStringBuffer();
        System.out.println(System.currentTimeMillis()-startTime+" ms");

//        char a []={'h','e','m','r','a','j'};
//        String s =new String(a);
//        System.out.println(s);
//
        String str = "hello my name is he,hemraj i am very lucky you are my friend ";
          String [] w= str.split("\\s");

      for(String k: w){
          System.out.println(k);
      }
//
//
       String str1 ="pakistan";
      String str8 ="";
      for(int i=0;i<str1.length();i++) {
          char a = str1.charAt(i);
         if (a!='a' && a!='e' && a!='i' && a!='o' && a!='u'){
             str8+=a;
         }

      }
        System.out.println(str8);

//
//
//        String str2=str1.replaceAll("[aeiouAEIOU]","");
//        System.out.print(str2+"\n");
//
//        /*
//        StringBuilder stringBuilder =new StringBuilder();
//        System.out.println();
//        System.out.println("aeiou".indexOf(str1));
//        */
//
//       StringBuilder str4 = new StringBuilder();
//       StringBuffer stringBuffer = new StringBuffer();
//
//       str4.append(" malhi");
//        System.out.println(str4);
//
//
//        int [] arr2 ={1,2,3,5,6,7,8,9};
//
//       for(int i=0; i<arr2.length;i++){
//           System.out.print(arr2[arr2.length-1-i]+" ");
//       }

        String palindrome="nitin";

        StringBuffer sb =new StringBuffer(palindrome);

        sb.reverse();

        String sbb = sb.toString();
        System.out.println();
        if(palindrome.equals(sbb)){
            System.out.println("true");
        }





        PalindromeChecker("nitin");


    }
}
