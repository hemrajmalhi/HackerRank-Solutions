package HackerRank;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.*;

public class Pro_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us= NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        Locale locale=new Locale("en","IN");
        String india=NumberFormat.getCurrencyInstance(locale).format(payment);
        String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " +india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}



