import java.util.Scanner;

public class ZiyareciKuyrugu {
    Scanner scanner = new Scanner(System.in);
    Ziyaretci front;  //head
    Ziyaretci rear;  // tail
    int counter;
    int N;
    String isim;
    public ZiyareciKuyrugu(int N) {
        this.N = N;
        counter = 0;
        front = null;
        rear = null;
    }
    public void enQueue(){
        if (isFull()){
            System.out.println("Kuyruk dolu.");
        }
        else{
            System.out.println("Ziyaretçi ismi: ");
            isim = scanner.nextLine();
            Ziyaretci eleman = new Ziyaretci(isim);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println("İlk ziyaretçi sıraya girdi. ");
            }
            else{
                rear.next = eleman;
                rear = eleman;
                System.out.println(rear.isim+" sıraya girdi. ");
            }
            counter++;
        }
    }
    public void deQueue(){
        if (isEmpty()){
            System.out.println("Kuyruk boş.");
        }
        else{
            System.out.println(front.isim+" silindi.");
            front = front.next;
            counter--;
            if (counter == 0){
                System.exit(0);
            }
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Kuyruk boş.");
        }
        else{
            Ziyaretci temp = front;
            System.out.print("Baş <-- ");
            while (temp != null){
                System.out.print(temp.isim+" <-- ");
                temp = temp.next;
            }
            System.out.print(" Son");
            System.out.println();
        }

    }
    boolean isFull(){
        return counter == N;
    }
    boolean isEmpty(){
        return counter == 0;
    }
}
