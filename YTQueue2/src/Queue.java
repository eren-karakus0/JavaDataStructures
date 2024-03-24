public class Queue {
    Node front;  //head
    Node rear;  // tail
    int counter;
    int size;
    public Queue(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }
    public void enQueue(int data){
        if (isFull()){
            System.out.println("Kuyruk dolu.");
        }
        else{
            Node eleman = new Node(data);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println(data+ " ilk eleman olarak kuyruğa eklendi. ");
            }
            else{
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data+" kuyruğa eklendi. ");
            }
            counter++;
        }
    }
    public void deQueue(){
        if (isEmpty()){
            System.out.println("Kuyruk boş.");
        }
        else{
            System.out.println(front.data+" silindi.");
            front = front.next;
            counter--;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Kuyruk boş.");
        }
        else{
            Node temp = front;
            System.out.print("Baş <-- ");
            while (temp != null){
                System.out.print(temp.data+" <-- ");
                temp = temp.next;
            }
            System.out.print(" Son");
        }
    }
    boolean isFull() {
        return counter == size;
    }
    boolean isEmpty(){
        return counter == 0;
    }
}