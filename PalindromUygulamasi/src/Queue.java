public class Queue {
    Node front;
    Node rear;
    int counter;
    int size;
    public Queue(int size) {
        this.size = size;
        front = null;
        rear = null;
        counter = 0;
    }
    public void enQueue(char ch){
        if (!isFull()){
            Node eleman = new Node(ch);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
            }
            else{
                rear.next = eleman;
                rear = eleman;
            }
            counter++;
        }
    }
    public char deQueue(){
        if (!isEmpty()){
            char ch = front.harf;
            front = front.next;
            counter--;
            return ch;
        }
        else{
            return '+';
        }
    }
    boolean isEmpty(){
        return counter == 0;
    }
    boolean isFull(){
        return counter == size;
    }
}
