import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj szybkość pojazdu (w km/h): ");
        int szybkosc = scanner.nextInt();

        if (szybkosc < 0) {
            System.out.println("Błąd: Szybkość nie może być ujemna.");
            return;
        }

        System.out.print("Podaj liczbę godzin podróży: ");
        int liczbaGodzin = scanner.nextInt();

        if (liczbaGodzin < 1) {
            System.out.println("Błąd: Liczba godzin podróży musi być większa lub równa 1.");
            return;
        }

        try {
            FileWriter writer = new FileWriter("odleglosc.txt");
            writer.write("Godzina Przebyta odległość\n");
            writer.write("-----------------------------\n");

            for (int godzina = 1; godzina <= liczbaGodzin; godzina++) {
                int odleglosc = szybkosc * godzina;
                writer.write(godzina + " " + odleglosc + "\n");
            }

            writer.close();

        } catch (IOException e) {

        }
    }
}
