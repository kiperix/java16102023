import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę lat: ");
        int lata = scanner.nextInt();


        if (lata < 1) {
            System.out.println("Liczba lat musi być większa niż 0.");
            return;
        }

        double calkowiteOpady = 0.0;


        for (int rok = 1; rok <= lata; rok++) {
            double opadyRoczne = 0.0;


            for (int month = 1; month <= 12; month++) {
                System.out.print("Podaj ilość opadów w miesiącu " + month + " roku " + rok + " (w centymetrach): ");
                double monthlyRainfall = scanner.nextDouble();


                if (monthlyRainfall < 0) {
                    System.out.println("Ilość opadów nie może być ujemna.");
                    return;
                }

                opadyRoczne += monthlyRainfall;
            }

            calkowiteOpady += opadyRoczne;
        }

        int totalMonths = lata * 12;
        double averageRainfall = calkowiteOpady / totalMonths;

        System.out.println("Łączna liczba miesięcy: " + totalMonths);
        System.out.println("Łączna ilość opadów: " + calkowiteOpady + " centymetrów");
        System.out.println("Średni poziom opadów na przestrzeni lat: " + averageRainfall + " centymetrów");
    }
}
