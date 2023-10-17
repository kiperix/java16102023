import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę pliku: ");
        String nazwaPliku = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku)) ) {
            String linia;
            int licznik = 0;

            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
                licznik++;

                if (licznik >= 5) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }
}
