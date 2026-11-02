import java.util.Scanner;

class hello {
    private static final Scanner scanner = new Scanner(System.in);

    private static void EndProgramm() {
        System.out.println("\n\nВведите Enter чтобы продолжить...");
        scanner.nextLine();
        scanner.close();
    }

    public static void main(String[] args) {
        float V, t, V0, result;
        System.out.printf("Введите скорость (в км/ч) - ");
        V = scanner.nextFloat();
        scanner.nextLine();
        System.out.printf("Введите начальную скорость (в км/ч) - ");
        V0 = scanner.nextFloat();
        scanner.nextLine();
        System.out.printf("Введите время (в секундах) - ");
        t = scanner.nextFloat();
        scanner.nextLine();

        result = MathFunctions.FindPath(V, V0, t);
        System.out.println("\nРезультат в м/с: " + result);
        EndProgramm();
    }

    
}

class MathFunctions {
    public static float FindPath(float V, float V0, float t) {
        float V_in_MS, a;
        V_in_MS = ConvertToMeter(V);
        a = Uskorenie(V_in_MS, V0, t);
        return Peremeschenie(V0, a, t);
    }

    private static float ConvertToMeter(float V_in_KMCH) {
        return (V_in_KMCH * 1000) / 3600;
    }

    private static float Uskorenie(float V, float V0, float t) {
        return (V - V0) / t;
    }

    private static float Peremeschenie(float V0, float a, float t) {
        return V0 * t + (a * (t * t) / 2);
    }
}