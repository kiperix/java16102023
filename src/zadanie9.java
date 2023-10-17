import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe organizmow");
        int liczbaOrganizmow = klawiatura.nextInt();
        if (liczbaOrganizmow < 2){
            System.out.println("Liczba populacji nie moze byc mniesza niz 2");
            return;
        }
        System.out.println("Podaj dzienny przyrost");
       double dziennyPrzyrost = klawiatura.nextDouble();
        if (dziennyPrzyrost < 0){
            System.out.println("Dzienny przyrost nie moze byc ujemny");
            return;
        }
        System.out.println("Podaj liczbe dni");
        int liczbaDni = klawiatura.nextInt();
        if (liczbaDni < 1){
            System.out.println("Liczba dni nie moze byc mniejsza od 1");
            return;
        }
       int prognoza =  liczbaOrganizmow;

        for (int i = 1;i<=liczbaDni;i++){
            prognoza += (dziennyPrzyrost/100)*prognoza;
            System.out.println("Liczba organzimow w dniu " + i +  " wynosi " + prognoza);
        }

    }
}
