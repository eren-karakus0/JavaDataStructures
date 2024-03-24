public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        queue.deQueue();
        queue.deQueue();

        queue.print();

        System.out.println();
        System.out.println("Kuyruktaki eleman sayısı: "+queue.counter);
        System.out.println("Kuyruktaki ilk eleman: "+queue.front.data);
        System.out.println("Kuyruktaki son eleman: "+queue.rear.data);
    }
}