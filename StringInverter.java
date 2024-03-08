import java.util.Scanner;

public class StringInverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto que deseja inverter");
        String text = scanner.nextLine();
        System.out.println("O texto invertido é:");
        System.out.println(inverseText(text));
    }

    private static String inverseText(String text) {
        StringBuilder inverted = new StringBuilder();
        for (int i = text.length() - 1 ; i >= 0 ; i--) {
            inverted.append(text.charAt(i));
        }
        return inverted.toString();
    }

}
