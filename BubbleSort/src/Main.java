import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Ka adet sayı: ");
        n = scanner.nextInt();
        int dizi[] = new int[n];

        for (int i = 0; i < n; i++){
            dizi[i] = scanner.nextInt();
        }

        bubbleSort(dizi, n);
        System.out.println("Bubble sort siralama");
        for (int i = 0; i < n; i++){
            System.out.print(dizi[i]+" ");
        }

    }

    private static void bubbleSort(int[] dizi, int n) {
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (dizi[j] > dizi[j+1]){
                    int gecici = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = gecici;
                }
            }
        }
    }
}