import java.util.Scanner;

class Main {
    private static Scanner globalScanner = new Scanner(System.in);

    public static void main(String args[]) {
        StartProgram();
        globalScanner.close();
    }

    private static void StartProgram() {
        Message();
        System.out.print("\n\nНажмите Enter для выхода...");
        globalScanner.nextLine();
    }

    private static void Message() {
        System.out.print("Можно пить пиво?\n");
        System.out.print("Введите возраст - ");
        int inpp = globalScanner.nextInt();
        globalScanner.nextLine(); 
        
        if (VerifyAge(inpp)) {
            System.out.print("\nПей пиво!");
        } else {
            System.out.print("\nПей пиво! Только тихо");
        }
    }

    private static boolean VerifyAge(int inpp) {
        if (inpp >= 18) {
            return true;
        } else {
            return false;
        }
    }
}