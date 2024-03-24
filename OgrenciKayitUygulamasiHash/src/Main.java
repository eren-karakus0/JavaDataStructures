import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ad;
        int numara;
        int ort;
        Hash hash = new Hash(5);
        int secim = menu();

        while (secim != 0){
            switch (secim){
                case 1:
                    System.out.print("Eklenecek öğrencinin numarası: "); numara = scanner.nextInt();
                    System.out.print("Ad: "); ad = scanner.next();
                    System.out.print("Ortalama: "); ort = scanner.nextInt();
                    hash.add(numara,ad,ort);
                    break;
                case 2:
                    System.out.print("Silinecek öğrencinin numarası: "); numara = scanner.nextInt();
                    hash.delete(numara);
                    break;
                case 3:
                    hash.print();
                    break;
                case 4:
                    System.out.print("Aranacak öğrencinin numarası: "); numara = scanner.nextInt();
                    hash.search(numara);
                case 0:break;
                default:System.out.println("Hatalı seçim yaptınız: ");
                    break;
            }
            secim = menu();
        }
    }
    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        int secim;
        System.out.println("1-Öğrenci ekle. ");
        System.out.println("2-Öğrenci sil. ");
        System.out.println("3-Öğrencileri yazdır. ");
        System.out.println("4-Öğrenci ara. ");
        System.out.println("0-Programı kapat. ");
        System.out.print("Seçiminiz: ");
        secim = scanner.nextInt();
        return secim;
    }
}