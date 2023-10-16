
import java.util.Scanner;

public class zadanie7 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Prosze podac ilosc dni: ");
        double dni = klawiatura.nextDouble();
        double x = 1;
        if(dni < 1){
            System.out.println("Cyfra nie moze byc mniejsza od 1");
        }
        for(double i=1; i<=dni;i++){
            System.out.println(i+ " " +(x/100) + "zł");
            x=x*2;
        }


    }
}