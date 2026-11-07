package lessons.Lesson6;

import java.util.Scanner;

public class Lesson6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = sc.nextLine();
        action = sc.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("Результат: " + res);
                break;
            default:
                System.out.println("Нет такой операции");
                break;
        }
    }
}
