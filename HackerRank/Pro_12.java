package HackerRank;

import java.time.LocalDate;
import java.io.*;
import java.util.Scanner;


public class Pro_12 {

        public static String findDay(int month, int day, int year) {
            return String.valueOf(LocalDate.of(year, month, day).getDayOfWeek());
        }
            public static void main(String[] args) {

            Scanner scan =new Scanner(System.in);

            int month = scan.nextInt();

            int day = scan.nextInt();

            int year = scan.nextInt();

                System.out.println(findDay(month,day,year));



        }
    }