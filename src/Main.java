import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kaç tane sayı gireceğini kullanıcıdan al
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // İlk sayıyı alarak en büyük ve en küçük değerlere başlangıç değerleri ver
        System.out.print("1. Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        // Diğer sayıları alarak en büyük ve en küçük değerleri güncelle
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

    }
}
