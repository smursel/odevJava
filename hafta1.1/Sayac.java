import java.util.Scanner;

public class Sayac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç sayısını girin: ");
        int baslangic = scanner.nextInt();

        System.out.println("Sayaç:");

        for (int i = baslangic; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}