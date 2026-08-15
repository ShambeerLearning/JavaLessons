package Scripts;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(mathFibonachi(10));
    }

    private static int mathFibonachi(int number) {
        if (number <= 1) {
            return number;
        }
        else {
            return mathFibonachi(number - 1) + mathFibonachi(number - 2);
        }
    }
}
