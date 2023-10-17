import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miesięczny budżet: ");
        double budzet = scanner.nextDouble();

        double suma = 0;

        for(;;)
        {
            System.out.print("Podaj wydatek wpisz 0, aby zakończyć: ");
            double wydatek = scanner.nextDouble();

            if (wydatek == 0) {
                break;
            }

            suma = suma+ wydatek;
        }


        double roznica = budzet - suma;
        System.out.println("Różnica między budżetem a wydatkami: " + roznica);
    }
}