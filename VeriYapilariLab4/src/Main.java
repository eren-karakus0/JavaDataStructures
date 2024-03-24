public class Main {
    public static void main(String[] args) {

        Kuyruk k =new Kuyruk();
        k.enqueue(10);
        k.enqueue(20);
        k.enqueue(30);
        k.enqueue(40);
        k.yazdir();
        k.dequeue();
        System.out.println();
        k.yazdir();
        System.out.println();
        k.dequeue();
        k.yazdir();
        k.enqueue(50);
        System.out.println();
        k.yazdir();
    }
}