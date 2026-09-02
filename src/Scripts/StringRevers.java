package Scripts;

public class StringRevers {
    public static void main(String[] args) {
        String word = "Привет";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
    }
}
