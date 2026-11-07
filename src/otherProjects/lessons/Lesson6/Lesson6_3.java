package lessons.Lesson6;

public class Lesson6_3 {
    public static void main(String[] args) {
        boolean isHasCar = true;
        if (isHasCar) {
            System.out.println("Да, верно1");
        }
        if (isHasCar == true) {
            System.out.println("Да, верно2");
        }
        if (isHasCar != false) {
            System.out.println("Да верно3");
        }
        isHasCar = false;
        if (!isHasCar) {
            System.out.println("Да, верно11");
        }
        if (isHasCar == false) {
            System.out.println("Да, верно22");
        }
        if (isHasCar != true) {
            System.out.println("Да, верно33");
        }
    }
}
