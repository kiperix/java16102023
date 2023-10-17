import java.util.Scanner;

public class zadanie5 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków: ");
        String lancuch = klawiatura.nextLine();

        System.out.print("Podaj znak do zliczenia: ");
        char znak = klawiatura.next().charAt(0);

        int liczbaWystapien = policzWystapienia(lancuch, znak);

        System.out.println("Liczba wystąpień znaku '" + znak + "' w łańcuchu: " + liczbaWystapien);
    }

    public static int policzWystapienia(String lancuch, char znak) {
        int liczbaWystapien = 0;

        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) == znak) {
                liczbaWystapien++;
            }
        }

        return liczbaWystapien;
    }
}
