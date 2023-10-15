import java.util.Scanner;

public class HAFTA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] katsayilar = { 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0 };

        int toplamDersKredisi = 0;
        double toplamKatsayi = 0.0;
        int dersSayisi = 0;

        while (true) {
            System.out.print("Ders notunu girin (çıkmak için 'h' girin): ");
            String giris = input.nextLine();

            if (giris.equals("h")) {
                break;
            }

            try {
                int notIndex = notaIndeksBul(giris);

                if (notIndex != -1) {
                    System.out.print("Dersin kredi puanını girin: ");
                    int kredi = input.nextInt();
                    input.nextLine();

                    double katsayi = kredi * katsayilar[notIndex];
                    toplamKatsayi += katsayi;
                    toplamDersKredisi += kredi;

                    dersSayisi++;
                } else {
                    System.out.println("Geçersiz not girişi. Lütfen AA, BA, BB gibi bir not girin.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
            }
        }

        if (dersSayisi > 0) {
            double agno = toplamKatsayi / toplamDersKredisi;
            System.out.println("Toplam ders sayısı: " + dersSayisi);
            System.out.println("AGNO: " + agno);

            if (agno >= 3.50 && agno <= 4.00) {
                System.out.println("Yüksek Onur Belgesi alındı.");
            } else if (agno >= 3.00 && agno < 3.50) {
                System.out.println("Onur Belgesi alındı.");
            }
        } else {
            System.out.println("Ders girilmedi.");
        }
    }

    public static int notaIndeksBul(String not) {
        int indeks;
        switch (not) {
            case "AA":
                indeks = 0;
                break;
            case "BA":
                indeks = 1;
                break;
            case "BB":
                indeks = 2;
                break;
            case "CB":
                indeks = 3;
                break;
            case "CC":
                indeks = 4;
                break;
            case "DC":
                indeks = 5;
                break;
            case "DD":
                indeks = 6;
                break;
            case "FD":
                indeks = 7;
                break;
            case "FF":
                indeks = 8;
                break;
            default:
                indeks = -1; // Geçersiz not durumu
                break;
        }
        return indeks;

    }}