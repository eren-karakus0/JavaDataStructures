public class Stack {
    Node top;
    int size;
    int counter;
    char harf;
    public Stack(int size) {
        this.size = size;
        counter = 0;
        top = null;
    }
    public void push(char ch){
        if (!isFull()){
            Node eleman = new Node(ch);
            if (isEmpty()){
                top = eleman;
            }
            else{
                eleman.next = top;
                top = eleman;
            }
            counter++;
        }

    }
    public char pop(){
        if (!isEmpty()){
            harf = top.harf;
            top = top.next;
            counter--;
            return harf;
        }
        else{
            return '-';
        }
    }
    boolean isEmpty(){
        return counter == 0;
    }
    boolean isFull(){
        return counter == size;
    }
}
