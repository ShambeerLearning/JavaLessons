package lessons.Lesson5;

import java.util.Scanner;

public class Lesson5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя - ");
        String user = scan.nextLine();
        System.out.print("\nВведите возраст - ");
        int age = scan.nextInt();
        System.out.println("Привет, " + user);
        System.out.println(1 + age);
    }
}
