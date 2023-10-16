import java.util.Random;
import java.util.Scanner;

public class zadanie18 {
    public static void main(String[] args) {
        Random random = new Random();
        int liczba = random.nextInt(100) + 1;
        int zgadnietaLiczba;
        int proby = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Zgadnij liczbę od 1 do 100.");

        do {
            System.out.print("Podaj swoją propozycję: ");
            zgadnietaLiczba = scanner.nextInt();
            proby++;

            if (zgadnietaLiczba < liczba) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else if (zgadnietaLiczba > liczba) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else {
                System.out.println("Brawo! Odgadłeś liczbę " + liczba + " w " + proby + " próbach.");
            }
        } while (zgadnietaLiczba != liczba);


    }
}
