import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int secim = -1;
        System.out.println("Kursa kayıt edilecek kişi sayısı: ");
        n = scanner.nextInt();
        Stack stack = new Stack(n);
        while (secim != 0){
            System.out.println("1-Kursa yeni kayıt.");
            System.out.println("2-En son kaydı sil.");
            System.out.println("3-Kursa kayıtlı kişiler.");
            System.out.println("4-En son kayıtlı kişi bilgileri.");
            System.out.println("5-Kalan kontenjan bilgileri.");
            System.out.println("0-Çıkış.");
            System.out.println("Seçiminiz: "); secim = scanner.nextInt();

            switch (secim)
            {
                case 1: stack.push();
                    break;
                case 2: stack.pop();
                    break;
                case 3: stack.print();
                    break;
                case 4: stack.esSonKayit();
                    break;
                case 5: stack.kalanKontenjanSayisi();
                    break;
                case 0:
                    System.out.println("Çıkış yaptınız:");
                break;
                default: System.out.println("Hatalı seçim. ");
            }
        }
    }
}