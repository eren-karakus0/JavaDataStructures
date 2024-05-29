import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Seçmeli sıralama

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Kaç sayı: ");
        n = scanner.nextInt();
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Sayı : ");
            dizi[i] = scanner.nextInt();
        }

        selectionSort(dizi, n);
        System.out.println("Sıralama yapıldı: ");
        for (int i = 0; i < n; i++){
            System.out.print(dizi[i] + " ");

        }
    }

    private static void selectionSort(int[] dizi, int n) {
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i; j < n; j++){
                if (dizi[min] > dizi[j]){
                    min = j;
                }
            }
            int temp = dizi[min];
            dizi[min] = dizi[i];
            dizi[i] = temp;
        }
    }
}