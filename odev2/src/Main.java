import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZiyareciKuyrugu ziyareciKuyrugu = new ZiyareciKuyrugu(2);
        int secim = -1;

        while (secim != 0){
            System.out.println("1-Ziyaretçi Ekle. ");
            System.out.println("2-Ziyaretçi sil. ");
            System.out.println("3-Mevcut ziyaretçi durumu. ");
            System.out.println("0-Çıkış. ");
            secim = scanner.nextInt();

            switch (secim){
                case 1: ziyareciKuyrugu.enQueue();
                    break;
                case 2: ziyareciKuyrugu.deQueue();
                    break;
                case 3: ziyareciKuyrugu.print();
                    break;
                case 0: System.out.println("Çıkış yapıldı: ");
                    break;
                default: System.out.println("Geçersiz seçim yapıldı. ");
            }
        }
    }
}