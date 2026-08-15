package Scripts;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(mathFactorial(5));
    }

    private static int mathFactorial(int number) {
        if (number <= 1) {
            return number;
        }
        else {
            return number * mathFactorial(number - 1);
        }
    }
}
