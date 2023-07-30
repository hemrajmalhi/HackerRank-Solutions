package HackerRank;

    import java.util.*;
    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }
    class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }

        class Pro_20{
            public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

         int number = my_calculator.divisor_sum(n);
                System.out.println(number);
    }


    }


