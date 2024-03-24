import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TekYonluListeYapisi listeYapisi = new TekYonluListeYapisi();
        Scanner scanner = new Scanner(System.in);
        int secim = 1;
        int sayi;
        int indis;

        while(secim != 0){
            System.out.println("1 Başa ekle.");
            System.out.println("2 Sona ekle.");
            System.out.println("3 Araya ekle.");
            System.out.println("4 Başatan Sil.");
            System.out.println("5 Sondan sil.");
            System.out.println("6 Aradan sil.");
            secim = scanner.nextInt();

            if (secim == 1){
                System.out.println("Sayi: ");
                sayi = scanner.nextInt();
                listeYapisi.basaEkle(sayi);
            }
            else if(secim == 2){
                System.out.println("Sayi: ");
                sayi = scanner.nextInt();
                listeYapisi.sonaEkle(sayi);
            }
            else if (secim == 3){
                System.out.println("Sayi: ");
                sayi = scanner.nextInt();
                System.out.println("İndis: ");
                indis = scanner.nextInt();
                listeYapisi.arayaEkle(indis,sayi);
            }
            else if (secim == 4){
                listeYapisi.bastanSil();
            }
            else if (secim == 5){
                listeYapisi.sondanSil();
            }
            else if (secim == 6){
                System.out.println("İndis: ");
                indis = scanner.nextInt();
                listeYapisi.aradanSil(indis);
            }
            else if (secim == 0){
                System.out.println("Görüşmek üzere:)))");
            }
            else{
                System.out.println("Verilen sayılardan birini giriniz:) ");
            }
        }
        listeYapisi.yazdir();
    }
}