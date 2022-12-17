import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ücgenin Alanını Bulan Programa Hos Geldiniz.");
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenarlarını giriniz.");
        double kenar1, kenar2, kenar3, u, cevre, alan;

        System.out.print("1. Kenar :");
        kenar1 = input.nextDouble();

        System.out.print("2. Kenar :");
        kenar2 = input.nextDouble();

        System.out.print("3. Kenar :");
        kenar3 = input.nextDouble();

        cevre = kenar1 + kenar2 + kenar3;
        u = cevre / 2;
        alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı   : " + Math.sqrt(alan));
    }
}