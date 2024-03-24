public class Stack {
    int size;
    int counter;
    Node top;  //En üst düğümü tutan gösterici


    public Stack(int size) {
        this.size = size;
        counter = 0;
        top = null;
    }
    public void push(int data){
        Node eleman = new Node(data);
        if (isFull()){
            System.out.println("Stack dolu. Ekleme yapılamaz.");
        }
        else{
            if (isEmpty()){
                top = eleman;
                System.out.println(top.data+" Stack'e ilk eleman eklendi.");
            }
            else{
                eleman.next = top;
                top = eleman;
                System.out.println(top.data+" Stack'e eklendi.");
            }
            counter++;
        }
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack boş.");
        }
        else{
            System.out.println(top.data+" Çıkartıldı.");
            top = top.next;
            counter--;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Stack boş. Yazdırılacak bir şey yok.");
        }
        else{
            Node temp = top;
            System.out.println("Stackteki veriler: ");
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void topShow(){
        if (isEmpty()){
            System.out.println("Stack boş.");
        }
        else{
            System.out.println("Top düğüm datası: "+top.data);
        }
    }
    boolean isFull(){
        return counter == size;
    }
    boolean isEmpty(){
        return counter == 0;
    }
}
