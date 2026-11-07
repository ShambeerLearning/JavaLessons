package lessons.Lesson3;

import java.util.Scanner;

public class Lesson5_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = scan.nextFloat();
        System.out.print("Введите второе число: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");
        
    }
}
