import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(100);
        Queue queue = new Queue(100);
        String kelime;
        System.out.println("Kelime giriniz: ");
        kelime = scanner.nextLine();
        int n = kelime.length();
        char[] harfler = kelime.toCharArray();
        int i = 0;
        while (i < n){
            stack.push(harfler[i]);
            queue.enQueue(harfler[i]);
            i++;
        }
        boolean sonuc = true;

        while (!stack.isEmpty()){
            if (stack.pop() != queue.deQueue()){
                sonuc = false;
                break;
            }
        }
        if (sonuc){
            System.out.println(kelime+" kelimesi palindromdur. ");
        }
        else{
            System.out.println(kelime+" kelimesi palindrom değildir. ");
        }
    }
}