package lessons.Lesson6;

import java.util.Scanner;

public class Lesson6_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("Num1");
                break;
            case 3:
                System.out.println("Num3");
                break;
            case 5:
                System.out.println("Num5");
                break;
            case 7:
                System.out.println("Num7");
                break;
            default:
                System.out.println("No Num");
                break;
        }
    }
}
