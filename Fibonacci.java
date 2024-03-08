import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele faz parte da sequência de fibonacci");
        int input = scanner.nextInt();
        List<Integer> result = generateFibonacci(input);
        System.out.println("A sequência de fibonacci até o valor aproximado é: ");
        System.out.println(result);
        System.out.printf("o N°: %s %s parte da sequência%n", input, (result.contains(input) ? "faz" : "não faz"));
        scanner.close();
    }

    private static List<Integer> generateFibonacci(int limit) {
        int a = 0;
        int b = 1;
        int currentNumberSequence = a;
        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(currentNumberSequence);
        while (currentNumberSequence <= limit) {
            a = b;
            b = currentNumberSequence;
            currentNumberSequence = a + b;
            fibonacciSequence.add(currentNumberSequence);
        }
        return fibonacciSequence;
    }


}