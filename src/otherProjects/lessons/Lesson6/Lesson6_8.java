package lessons.Lesson6;

import java.util.Scanner;

public class Lesson6_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scan.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scan.nextLine();
        if (role.equals("Admin") && pass.equals("Admin")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как вас зовут?");
            String name = scan.nextLine();
            System.out.println("Привет " + name + ", у вас нет доступа");
        }
    }
}
