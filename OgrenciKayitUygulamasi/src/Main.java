import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secim = -1;
        List list = new List();
        Scanner scanner = new Scanner(System.in);

        while(secim != 0){
            System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması. ");
            System.out.println("1-Yeni kayıt:");
            System.out.println("2-Kayıt sil:");
            System.out.println("3-Kayıtları Listele:");
            System.out.println("4-En başarılı öğrenci bilgileri:");
            System.out.println("0-Çıkış.");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            if (secim == 1) {
                list.ekle();
            }
            else if (secim == 2){
                list.sil();
            }
            else if (secim == 3){
                list.yazdir();
            }
            else if (secim == 4){
                list.enBasariliOgrenci();
            }
            else if (secim == 0){
                System.out.println("Programı sonlandırdınız. Görüşmek üzere...");
            }
            else{
                System.out.println("Hatalı seçim yaptınız: ");
            }


        }



    }
}