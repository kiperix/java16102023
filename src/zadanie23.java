import java.util.Scanner;

public class zadanie23 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Jak sie nazywasz?: ");
        String imie = klawiatura.nextLine();
        Scanner klawiatura2 = new Scanner(System.in);
        System.out.println("Opisz siebie: ");
        String opis = klawiatura2.nextLine();

        System.out.println(
                "<html>\n<head>\n</head>\n<body>\n<center>\n<h1>" + imie + "</h1>\n</center>\n<hr/>\n" + opis + "\n<hr/>\n</body>\n</html>");

    }
}