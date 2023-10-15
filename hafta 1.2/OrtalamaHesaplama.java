import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Sayı " + i + ": ");
            int sayi = scanner.nextInt();
            toplam += sayi;
        }

        double ortalama = (double) toplam / 10;
        System.out.println("Girilen sayıların ortalaması: " + ortalama);

        scanner.close();
    }
}