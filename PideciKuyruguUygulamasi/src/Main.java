import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(5);
        int secim = -1;

        while (secim != 0){
            System.out.println("1-Yeni müşteri ekle. ");
            System.out.println("2-Satış yap. ");
            System.out.println("3-Bekleyen müşteriler. ");
            System.out.println("4-Toplam gelir. ");
            System.out.println("0-Çıkış. ");
            secim = scanner.nextInt();

            switch (secim){
                case 1: queue.enQueue();
                break;
                case 2: queue.deQueue();
                break;
                case 3: queue.print();
                break;
                case 4: System.out.println("Toplam gelir: "+queue.toplamGelir);
                break;
                case 0: System.out.println("Çıkış yapıldı: ");
                break;
                default: System.out.println("Geçersiz seçim yapıldı. ");
            }


        }
    }
}