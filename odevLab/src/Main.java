import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        MyStack stack = new MyStack(length);

        int i;
        for (i = 0; i < length / 2; i++) {
            stack.push(str.charAt(i));
        }

        if (length % 2 == 1) {
            i++;
        }

        while (i < length) {
            if (stack.isEmpty() || str.charAt(i) != stack.pop()) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("odev.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (isPalindrome(line.toLowerCase().replaceAll("[^a-zA-Z]", ""))) {
                    System.out.println("\"" + line + "\" bir palindromdur.");
                }
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}
