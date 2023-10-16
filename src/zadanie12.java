import java.util.Scanner;

public class zadanie12 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Prosze podac wartosc sprzedazy sklepu 1: ");
        double wartosc1 = klawiatura.nextDouble();

        System.out.println("Prosze podac wartosc sprzedazy sklepu 2: ");
        double wartosc2 = klawiatura.nextDouble();

        System.out.println("Prosze podac wartosc sprzedazy sklepu 3: ");
        double wartosc3 = klawiatura.nextDouble();

        System.out.println("Prosze podac wartosc sprzedazy sklepu 4: ");
        double wartosc4 = klawiatura.nextDouble();

        System.out.println("Prosze podac wartosc sprzedazy sklepu 5: ");
        double wartosc5 = klawiatura.nextDouble();
        System.out.println("Sklep nr1 : ");
        for (int i=1; i<=wartosc1/100; i++){

            System.out.print("*");
        }
        System.out.println("\n" + "Sklep nr2 : ");
        for (int i=1; i<=wartosc2/100; i++){

            System.out.print("*");
        }
        System.out.println("\n" +"Sklep nr3 : ");
        for (int i=1; i<=wartosc3/100; i++){

            System.out.print("*");
        }
        System.out.println("\n" +"Sklep nr4 : ");
        for (int i=1; i<=wartosc4/100; i++){

            System.out.print("*");
        }
        System.out.println("\n" +"Sklep nr5 : ");
        for (int i=1; i<=wartosc5/100; i++){

            System.out.print("*");
        }

    }
}