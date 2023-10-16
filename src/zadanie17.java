import java.util.Random;
import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        Random random = new Random();
        int liczba = random.nextInt(100) + 1;
        int zgadnietaLiczba;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Zgadnij liczbę od 1 do 100.");

        do {
            System.out.print("Podaj swoją propozycję: ");
            zgadnietaLiczba = scanner.nextInt();


            if (zgadnietaLiczba < liczba) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else if (zgadnietaLiczba > liczba) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else {
                System.out.println("Brawo! Odgadłeś liczbę " + liczba);
            }
        } while (zgadnietaLiczba != liczba);


    }
}
