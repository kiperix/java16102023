
import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        double suma = 0;

        System.out.println("Podaj dodatnia niezerowa liczbe: ");
        double liczba = klawiatura.nextDouble();

        for(int i=1;i<=liczba;i++){
             suma = suma + i;
        }

        System.out.println("Suma wynosi: " + suma);



    }
}