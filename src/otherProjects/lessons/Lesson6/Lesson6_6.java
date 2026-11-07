package lessons.Lesson6;

public class Lesson6_6 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        if (a == 6) {
            System.out.println("А равно 6");
        } else if (a == 5) {
            System.out.println("А равно 5");
            if(b == 6) {
                System.out.println("B равно 6");
            } else if (b == 10) {
                System.out.println("B равно 10");
            }
        } else {
            System.out.println("Дургое число");
        }
    }
}
