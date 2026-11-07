package lessons.Lesson4;

public class Lesson4 {
    public static void main(String[] args){
        System.out.println("Переменные и типы данных");

        int age1;
        age1 = 5;
        System.out.println("Возраст: " + age1);
        age1 = 45;
        System.out.println(age1);

        byte num1 = 127;
        short num2 = 128;
        int num3 = 12312;
        long num4 = 123123123;

        float num5 = 0.123123f;
        double num6 = 0.1223123123d;

        char f = 'f';
        String ff = "ewfewfew";
        System.out.println(ff);
        String fff = """
                dggdfgdfgdfgdfg
                gdfgdfgdfgdfgdfgdf
                gdfgdfgdfgdfgdfgdfg
                """;
        System.out.println(fff);
        boolean isHappy = true;
        System.out.println(isHappy);
    }
}
