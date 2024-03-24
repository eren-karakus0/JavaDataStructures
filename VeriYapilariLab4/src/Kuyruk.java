public class Kuyruk {
    Node front;
    Node rear;
    public Kuyruk() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data){
        Node temp=new Node(data);
        if (front==null){
            front=rear=temp;
        }
        rear.next=temp;
        rear=temp;
    }
    public void yazdir(){
        Node temp;
        temp=front;
        while (temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
    }
    public void dequeue(){
        if (front==null){
            System.out.println("Kuyruk bos.");
        }
        else {
            front=front.next;
        }if (front==null){
            rear=null;
        }
    }
}