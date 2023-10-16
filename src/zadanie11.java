import java.util.Scanner;

public class zadanie11 {

    public static void main(String[] args) {
        double fahr = 0;

        for(int i=0; i<20;i++){
            fahr = (i*9.0/5.0) + 32;
            System.out.println(i +"C to " + fahr +"F");

        }


    }
}