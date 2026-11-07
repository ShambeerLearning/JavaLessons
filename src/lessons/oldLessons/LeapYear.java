package lessons.oldLessons;

import java.util.Scanner;

public class LeapYear {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println(isLeapYear(year));
        scanner.nextLine();
        scanner.close();
    }

    private static String isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "Год високосный";
        }
        else {
            return "Год обычный";
        }
    }
}
