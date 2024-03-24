import java.util.Scanner;
public class Queue {
    Scanner scanner = new Scanner(System.in);
    Node front;  //head
    Node rear;  //tail
    int size;
    int counter;
    String isim;
    int adet;
    int toplamGelir = 0;
    public Queue(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }
    public void enQueue(){
        if (isFull()){
            System.out.println("Kuyruk dolu.");
        }
        else{
            System.out.println("Müşteri ismi: ");
            isim = scanner.nextLine();
            System.out.println("Alınacak pide adeti: ");
            adet = scanner.nextInt();
            Node eleman = new Node(isim, adet);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println("İlk müşteri sıraya girdi. ");
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
            System.out.println("Sırada kimse yok. ");
        }
        else{
            toplamGelir += front.ucret;
            System.out.println(front.isim+" "+front.adet+" adet pide aldı, toplam borcu: "+front.ucret+" TL.");
            front = front.next;
            counter--;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Sırada kimse yok. ");
        }
        else{
            Node temp = front;
            System.out.println("Baş <-- ");
            while (temp != null){
                System.out.println(temp.isim+" <-- ");
                temp = temp.next;
            }
            System.out.println(" Son");
        }
    }
    boolean isEmpty(){
        return counter == 0;
    }
    boolean isFull(){
        return counter == size;
    }


}
