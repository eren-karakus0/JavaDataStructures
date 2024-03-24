public class Stack {
    Node head;

    public Stack() {
        this.head = null;
    }
    public void push(int sayi){
        Node newNode = new Node();
        newNode.next=head;
        head=newNode;
    }
    public int pop(){
        int silinen=head.value;
        head=head.next;
        return silinen;
    }

    public void yazdir(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value+ " ");
            temp=temp.next;
        }
    }
    public int peek(){
        return head.value;

    }
    public void elemanSay(){
        Node temp=head;
        int sayac=0;
        while (temp!=null){
            sayac=sayac+1;
            temp=temp.next;
        }
        System.out.println("Eleman sayisi: " + sayac);
    }
    public void bosMu(){
        if(head==null){
            System.out.println("Stack bos.");
        }else{
            System.out.println("Stack dolu.");
        }
    }

}
