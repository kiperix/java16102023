import java.util.Scanner;

public class zadanie7 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj liczbę pięter w hotelu: ");
        int liczbaPieter = klawiatura.nextInt();

        if (liczbaPieter < 1) {
            System.out.println("Liczba pięter musi być większa lub równa 1.");
            return;
        }

        int lacznaLiczbaPokoi = 0;
        int liczbaZajetychPokoi = 0;

        for (int pietro = 1; pietro <= liczbaPieter; pietro++) {
            System.out.print("Podaj liczbę wszystkich pokoi na piętrze " + pietro + ": ");
            int wszystkiePokoje = klawiatura.nextInt();

            if (wszystkiePokoje < 10) {
                System.out.println("Liczba pokoi na piętrze musi być większa lub równa 10.");
                return;
            }

            System.out.print("Podaj liczbę zajętych pokoi na piętrze " + pietro + ": ");
            int zajetePokoje = klawiatura.nextInt();

            lacznaLiczbaPokoi += wszystkiePokoje;
            liczbaZajetychPokoi += zajetePokoje;
        }

        int liczbaPustychPokoi = lacznaLiczbaPokoi - liczbaZajetychPokoi;
        double poziomOblozenia = (double) liczbaZajetychPokoi / lacznaLiczbaPokoi;

        System.out.println("Liczba wszystkich pokoi w hotelu: " + lacznaLiczbaPokoi);
        System.out.println("Liczba zajętych pokoi: " + liczbaZajetychPokoi);
        System.out.println("Liczba pustych pokoi: " + liczbaPustychPokoi);
        System.out.println("Poziom obłożenia hotelu: " + (poziomOblozenia * 100) + "%");
    }
}
