import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int input;

        System.out.println("Podawj liczby całkowite. Wpisz -99, aby zakończyć.");

        do {
            System.out.print("Wprowadź liczbę: ");
            input = scanner.nextInt();

            if (input != -99) {
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
            }

        } while (input != -99);

        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            System.out.println("Nie wprowadzono żadnych liczb.");
        } else {
            System.out.println("Największa wprowadzona liczba: " + max);
            System.out.println("Najmniejsza wprowadzona liczba: " + min);
        }
    }
}
