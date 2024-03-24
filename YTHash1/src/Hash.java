public class Hash {
    Node[] dizi;
    int size;
    public Hash(int size) {
        this.size = size;
        dizi = new Node[size];

        for (int i = 0; i < size; i++){
            dizi[i] = new Node();
        }
    }
    public int indexUret(int key){
        return key % size;
    }
    public void ekle(int key, String isim){
        int index = indexUret(key);
        Node eleman = new Node(key, isim);
        Node temp = dizi[index];

        while (temp.next != null)  // ilgili bağlı listenin sonunda ekleme
            temp = temp.next;
        temp.next = eleman;
        System.out.println(eleman.isim+" eklendi.");

    }
    public void sil(int key){
        int indis = indexUret(key);
        Node temp = dizi[indis];
        Node temp2 = dizi[indis];
        if (temp.next == null){
            System.out.println(key+" numaralı kayıt yok.");
        }
        else if(temp.next.next == null && temp.next.key == key){
            System.out.println("Bu kısımdaki son kişi olan "+temp.next.isim+" silindi.");
            temp.next = null;
        }
        else{
            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
                if (temp.key == key){
                    System.out.println(temp.isim+" silindi.");
                    temp2.next = temp.next;
                }
            }
        }
    }
    public void yazdir(){
        for (int i = 0; i < size; i++){
            Node temp = dizi[i];
            System.out.print("Dizi["+i+"] --> ");
            if (temp.next != null)
                while (temp.next != null){
                    System.out.print(temp.next.key + " " + temp.next.isim+" --> ");
                    temp = temp.next;
                }
            System.out.println();

        }

    }

}
