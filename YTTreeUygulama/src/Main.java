import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();
        int no, not;
        String ad;
        int secim = menu();

        while (secim != 0){
            switch (secim){
                case 1:
                    System.out.println("Eklenecek öğrenci bilgilerini giriniz: ");
                    System.out.println("Numara: "); no = scanner.nextInt();
                    System.out.println("Ad: "); ad = scanner.next();
                    System.out.println("Not: "); not = scanner.nextInt();
                    tree.root = tree.insert(tree.root, no, ad, not);
                    System.out.println(no + " numaralı öğrenci eklendi. ");
                    break;
                case 2:
                    System.out.println("Silinecek öğrenci numarası: ");
                    no = scanner.nextInt();
                    tree.root = tree.delete(tree.root, no);
                    System.out.println(no + " numaralı çğrenci silindi. ");
                    break;
                case 3:
                    System.out.println("No:\t" + "Ad:\t" + "Not:");
                    tree.inOrder(tree.root);
                    break;
                case 0: break;
                default:
                    System.out.println("Hatalı seçim yaptınız: ");
                    break;
            }
            secim = menu();
        }

    }
    private static int menu(){
        int secim;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1)Ekle: ");
        System.out.println("2)Sil: ");
        System.out.println("3)Yazdır: ");
        System.out.println("0)Çıkış: ");
        System.out.println("Seçiminiz: ");
        secim = scanner.nextInt();
        return secim;
    }
}