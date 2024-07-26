public class Pro_46 {

    static boolean checkPalindrome(String str) {

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String sbb = sb.toString();
        if (str.equals(sbb)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("nitin"));
        System.out.println(checkPalindrome("jitin"));


        String content = "my name is hemraj malhi";
        char[] ch = content.toCharArray();
        for(int i =ch.length-1;i>=0; i--)

        {
            System.out.print(ch[i]);
        }

        String s1="javatpoint";
        String s2="javatpoint";

        System.out.println();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String r4 ="this is javatpoint";
        System.out.println(r4.toUpperCase());


       String  str1= "This Is JavaPoint";
       String [] words=str1.split("\\s");
       String toggle=" ";
       for (String word:words){
           StringBuffer sb=new StringBuffer(word);
           String reverseString =sb.reverse().toString();
          String first =reverseString.substring(0,1);
          String firstAfter=reverseString.substring(1);
          toggle +=first.toLowerCase()+firstAfter.toUpperCase()+" ";
      }

        System.out.println(toggle);

        String a ="5";

        int b =Integer.parseInt(a);

        System.out.println(b);

    }
}


