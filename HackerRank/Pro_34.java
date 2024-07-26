package HackerRank;
public class Pro_34 {
    public static void main(String[] args) {
        try {
            validateNumber(-1);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        System.out.println("Number is valid.");
    }
}
