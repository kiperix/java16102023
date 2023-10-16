
import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Prosze podac predkosc: ");
        double predkosc = klawiatura.nextDouble();
        Scanner klawiatura2 = new Scanner(System.in);
        System.out.println("Prosze podac czas: ");
        double czas = klawiatura2.nextDouble();
        for(int i = 1; i<=czas;i++){
            System.out.println(i+" "+predkosc*i);
        }


    }
}