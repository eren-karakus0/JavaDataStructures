import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stack boyutunu giriniz: ");
        int boyut = scanner.nextInt();
        Stack stack = new Stack(boyut);

        int secim = -1;
        int sayi;
        while (secim != 0){
            System.out.println("1-push()");
            System.out.println("2-pop()");
            System.out.println("3-topShow()");
            System.out.println("4-print()");
            System.out.println("0-exit()");
            System.out.println("Seçiminiz: "); secim = scanner.nextInt();
            switch (secim)
            {
                case 1: System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                stack.push(sayi);
                break;
                case 2: stack.pop();
                break;
                case 3: stack.topShow();
                break;
                case 4: stack.print();
                break;
                case 0: System.out.println("Çıkış yaptınız:");
                break;
                default: System.out.println("Hatalı seçim.");
            }
        }
    }
}