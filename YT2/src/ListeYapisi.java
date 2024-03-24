public class ListeYapisi {

    Node head = null;
    Node tail = null;

    public void ekle(int x){
        Node eleman = new Node(); //eklenecek olan düğüm
        eleman.data = x;
        eleman.next = null;


        if (head == null){
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi");
        }
        else{
            tail.next = eleman;  // son elemanın devamına yeni düğümü ekledik
            tail = eleman;
            System.out.println("Listenin sonunda yeni bir eleman eklendi");
        }
    }
    public void yazdir(){
        if (head == null){
            System.out.println("Liste yapısı boş!");
        }
        else{
            Node temp = head;
            System.out.println("Baş ->");
            while(temp!=null){
                System.out.println(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Son.");
        }
    }

}
