import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1 ESERCIZIO
        //1 parte
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int primoNumero = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il secondo numero");
        int secondoNumero = Integer.parseInt(scanner.nextLine());

        System.out.println("La moltiplicazione dei due numeri è: " + (primoNumero * secondoNumero));

        //2 parte
        int numero = 1;
        String stringa = "ciao";
        System.out.println(stringa + numero);

        //3 parte
        String[] arrayDiStringhe = {"gatto", "topo", "cane", "elefante", "coniglio"};

        //ESERCIZIO 2
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Inserisci una prima parola");
        String primaParola = scannerString.nextLine();
        System.out.println("La prima parola è: " + primaParola);
        System.out.println("Inserisci una seconda parola");
        String secondaParola = scannerString.nextLine();
        System.out.println("La seconda parola è: " + secondaParola);
        System.out.println("Inserisci una terza parola");
        String terzaParola = scannerString.nextLine();
        System.out.println("La terza parola é: " + terzaParola);
        String stringaInOrdine = primaParola + secondaParola + terzaParola;
        System.out.println(stringaInOrdine);
        String stringaInversa = terzaParola + secondaParola + primaParola;
        System.out.println(stringaInversa);

        //ESERCIZIO 3
        //1 parte
        double firstNumber = 5.845621;
        double secondNumber = 95.7785;
        double perimetroRettangolo = (firstNumber + secondNumber) * 2;
        System.out.println(perimetroRettangolo);

        //2 parte
        Scanner number = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numberIsEven = number.nextInt();

        if (numberIsEven % 2 == 0)
            System.out.println("Il numero è pari");
        else
            System.out.println("Il numero è dispari");

        //3 parte
        
    }
}
