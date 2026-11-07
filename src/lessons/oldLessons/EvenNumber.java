package lessons.oldLessons;

import java.util.Scanner;

public class EvenNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Результат: " + isEven(input));
        scanner.nextLine();
        scanner.close();
    }

    private static String isEven(int number) {
        if (number % 2 == 0) {
            return "Четное";
        }
        else {
            return "Нечетное";
        }
    }
}
