public class BagliListe {
    Node head = null;

    public BagliListe() {
        this.head = null;
    }
    public void sonaElemanEkle(int sayi){
        Node yeniNode = new Node(sayi);
        if (head == null){
            head = yeniNode;
        }
        else {
            Node temp = head;
            while (temp.sonraki != null){
                temp = temp.sonraki;
            }
            temp.sonraki = yeniNode;
        }
    }
    public void basaElemanEkle(int sayi){
        Node yeniNode = new Node(sayi);
        if (head == null){
            head = yeniNode;
        }
        else{
            Node temp = head;
            head = yeniNode;
            head.sonraki = temp;
        }
    }
    public void yazdir(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.sayi + " ->" );
            temp = temp.sonraki;
        }
    }
    public void elemanSayisi(){
        int sayac = 0;
        Node temp = head;
        if (head == null){
            System.out.print("Liste boş! ");
        }
        while (temp != null){
            sayac++;
            temp = temp.sonraki;
        }
        System.out.println("Eleman sayisi: "+sayac);
    }
    public void elemanSil(int i){
        Node temp = head;
        if (temp.sayi == i){
            head = head.sonraki;
            return;
        }
        else {
            while (temp!=null){
                temp.sonraki = temp.sonraki.sonraki;
                return;
            }
            temp = temp.sonraki;
        }
    }
}
