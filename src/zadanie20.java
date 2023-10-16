import java.util.Scanner;

public class zadanie20 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Prosze podac liczbe nie wieksza niz 15: ");
        double liczba = klawiatura.nextDouble();

            for(int i=1; i<=liczba;i++ ){
                for(int a=1; a<liczba;a++ ) {
                    System.out.print("X");
                }

                System.out.println("X");

            }

    }
}