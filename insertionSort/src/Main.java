import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sıralama - eklemeli sıralama
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç sayı: ");
        int n = scanner.nextInt();
        int []dizi = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Sayı: ");
            dizi[i] = scanner.nextInt();
        }
        insortSort(dizi, n);
        System.out.println("Sıralama: ");
        for (int i = 0; i < n; i++){
            System.out.println(" " + dizi[i]);
        }

    }

    private static void insortSort(int[] dizi, int n) {
        for (int i = 1; i < n; i++){
            for (int k = i; k > 0; k--){
                if (dizi[k] < dizi[k - 1]){
                    int temp = dizi[k];
                    dizi[k] = dizi[k - 1];
                    dizi[k - 1] = temp;
                }
            }
        }
    }
}