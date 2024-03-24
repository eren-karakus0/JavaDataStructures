public class TekYonluListeYapisi {
    Node head = null;
    Node tail = null;

    public void basaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        if (head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
        }
        else{
            eleman.next = head;
            head = eleman;
            System.out.println("Başa eleman eklendi.");
        }
    }
    public void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        if (head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
        }
        else{
            tail.next = eleman; //ekleme yaptık
            tail = eleman; // isim güncelliyoruz
            System.out.println("Sona eleman eklendi");
        }
    }
    public void arayaEkle(int indis, int x){
        Node eleman = new Node();
        eleman.data = x;
        if (head == null && indis == 0){
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else if(head != null && indis == 0){
            eleman.next = head;
            head = eleman;
            System.out.println(indis+". sıraya eleman eklendi.");
        }
        else{
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while(temp.next != null){
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if (n == indis){
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi.");
            }
            else{
                temp = head;
                temp2 = head;
                int i = 0;

                while (i < indis){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis+". sıraya yeni eleman eklendi");
            }
        }
    }
    public void bastanSil(){
        if (head == null){
            System.out.println("Silinecek nesne yok. Liste boş");
        }
        else if(head.next == null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi.");
        }
        else{
            head = head.next;
            System.out.println("Baştaki eleman silindi.");
        }
    }
    public void sondanSil(){
        if (head == null){
            System.out.println("Silinecek eleman yok. Liste boş.");
        }
        else if (head.next == null){
            head = null;
            tail = null;
            System.out.println("Listedeki tek eleman silindi.");
        }
        else{
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("Sondaki eleman silindi.");
        }
    }
    public void aradanSil(int indis){
        if (head == null){
            System.out.println("Silinecek eleman yok");
        }
        else if (head.next == null && indis == 0){
            head = null;
            tail = null;
            System.out.println("Listedeki tek eleman silindi.");
        }
        else if (head.next != null && indis == 0){
            head = head.next;
            System.out.println("Baştaki eleman silindi.");
        }
        else{
            int i = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp != null){
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            if (i == indis){
                temp2.next = null;
                tail = temp2;
                System.out.println("Son eleman silindi.");
            }
            else{
                int j = 0;
                temp = head;
                temp2 = head;
                while(j != indis){
                    j++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
                System.out.println("Aradaki nesne silindi.");
            }

        }
    }
    public void yazdir(){
        if (head == null){
            System.out.println("Liste yapısı boş!");
        }
        else{
            Node temp = head;
            System.out.print("Baş -> ");
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Son.");
        }
    }
}



