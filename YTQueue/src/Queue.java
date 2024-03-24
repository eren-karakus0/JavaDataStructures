public class Queue {
    int[] dizi;
    int size;
    int front;     //dizinin baştaki elemanı
    int rear;      //dizinin sondaki elemanı

    public Queue(int size) {
        this.size = size;
        dizi = new int[size];  //kuyruk yapısı
        front = 0;
        rear = -1;
    }
    public void enQueue(int data){  //kuyruğa ekleme
        if (isFull()){
            System.out.println("Kuyruk dolu ekleme yapamazsın.");
        }
        else{
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear]+" kuyruğa eklendi.");
        }

    }
    public void deQueue(){  //kuruktan silme
        if (isEmpty()){
            System.out.println("Kuyruk boş.");
        }
        else{
            int sayi = dizi[front];
            for (int i = 1; i <= rear; i++){
                dizi[i-1] = dizi[i];
            }
            rear--;
            System.out.println(sayi+" kuyruktan çıkartıldı. ");
        }
    }
    public void elemanSayisi(){
        System.out.println("Eleman sayısı: "+(rear+1));
    }
    public void print(){
        int i = rear;
        System.out.print("Son --> ");
        while (i >= 0){
            System.out.print(dizi[i]+" --> ");
            i--;
        }
        System.out.print("Baş");
    }
    boolean isFull(){
        return rear == size - 1;
    }
    boolean isEmpty(){
        return rear == -1;
    }
}
