package HackerRank;
import java.util.Scanner;

public class Pro_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\W+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }

    }
}
