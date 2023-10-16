import java.util.Random;

public class zadanie21 {
    public static void main(String[] args) {
        int iloscRzutow = 10;
        int wygraneKomputera = 0;
        int wygraneUzytkownika = 0;

        Random rand = new Random();

        for (int i = 0; i < iloscRzutow; i++) {
            int rzutKomputera = rand.nextInt(6) + 1;
            int rzutUzytkownika = rand.nextInt(6) + 1;

            System.out.println("Rzut komputera: " + rzutKomputera);
            System.out.println("Twój rzut: " + rzutUzytkownika);

            if (rzutKomputera > rzutUzytkownika) {
                System.out.println("Komputer wygrał ten rzut.");
                wygraneKomputera++;
            } else if (rzutKomputera < rzutUzytkownika) {
                System.out.println("Wygrałeś ten rzut!");
                wygraneUzytkownika++;
            } else {
                System.out.println("Remis w tym rzucie.");
            }

            System.out.println();
        }

        System.out.println("Wynik końcowy:");
        System.out.println("Komputer: " + wygraneKomputera + " wygranych");
        System.out.println("Użytkownik: " + wygraneUzytkownika + " wygranych");

        if (wygraneKomputera > wygraneUzytkownika) {
            System.out.println("Komputer wygrał grę!");
        } else if (wygraneKomputera < wygraneUzytkownika) {
            System.out.println("Gratulacje, wygrałeś grę!");
        } else {
            System.out.println("Remis w całej grze.");
        }
    }
}
