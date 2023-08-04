package HackerRank;

/*
* this question ask me impetus company of hyderabad */
public class Pro_27 {

    public  static boolean isVowel(char ch) {
        char cha=Character.toLowerCase(ch);
       return cha=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
    }
    public static void main(String[] args) {
        String word="Pakistan";
        String consonants="";
        word=word.toLowerCase();
        for (int i=0;i<word.length();i++){
           char ch=word.charAt(i);
            System.out.println(ch);
           if (!isVowel(ch)){
              consonants+=ch;

             }
        }
        System.out.println(consonants);
    }
}
