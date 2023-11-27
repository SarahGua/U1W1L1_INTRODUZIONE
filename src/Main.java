import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int primoNumero = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il secondo numero");
        int secondoNumero = Integer.parseInt(scanner.nextLine());

        System.out.println("La moltiplicazione dei due numeri è: " + (primoNumero * secondoNumero));
    }
}