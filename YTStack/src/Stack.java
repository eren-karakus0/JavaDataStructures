public class Stack {
    int[] dizi;
    int size;
    int indis;
    public Stack(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }
    public void push(int data){         //ekle
        if (isFull()){
            System.out.println("Stack dolu.");
        }
        else{
            indis++;
            dizi[indis] = data;
            System.out.println("push()Eklenen: "+dizi[indis]);
        }
    }
    public int pop(){      //sil
        if (!isEmpty()){
            return dizi[indis--];
        }
        else{
            System.out.println("Dizi boş. ");
            return -1;
        }
    }
    boolean isFull(){
        return (indis == size-1);
    }
    boolean isEmpty(){
        return (indis == -1);
    }
}
