import java.time.chrono.IsoChronology;

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
    public int indisUret(int numara){
        return numara % size;
    }
    public void add(int numara, String ad, int ort){
        int indis = indisUret(numara);
        Node ogrenci = new Node(numara, ad, ort);
        Node temp = dizi[indis];
        while (temp.next != null)
            temp = temp.next;
        temp.next = ogrenci;
        System.out.println(ad+" Eklendi.");
    }
    public void delete(int numara){
        int indis = indisUret(numara);
        Node temp = dizi[indis];
        Node temp2 = temp;
        boolean sonuc = false;
        if (temp.next == null){
            System.out.println(numara+" Numaralı öğrenci yok.");
            sonuc = true;
        }
        else if(temp.next == null && temp.next.numara == numara){
            sonuc = true;
            temp.next = null;
            System.out.println(numara+" Numaralı öğrenci silindi. ");
        }
        else{
            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
                if (temp.numara == numara){
                    sonuc = true;
                    temp2.next = temp.next;
                    System.out.println(numara+" Numaralı öğrenci silindi.");
                }
            }
        }
        if (sonuc == false){
            System.out.println(numara+" Numaralı öğrenci kaydına ulaşılamadı.");
        }
    }
    public void print(){
        System.out.println("Numara - Ad - Ortalama - Durum");
        for (int i = 0; i < size; i++){
            Node temp = dizi[i];
            while (temp.next != null){
                System.out.println(temp.next.numara+"-"+temp.next.ad+"-"+temp.next.ort+"-"+temp.next.durum);
                temp = temp.next;
            }
        }
    }
    public void search(int numara){
        int indis = indisUret(numara);
        boolean sonuc = false;
        Node temp = dizi[indis];

        while (temp.next != null){
            if (temp.next.numara == numara){
                sonuc = true;
                System.out.println(numara+" Numaralı öğrenci bilgileri.");
                System.out.println("Ad: "+temp.next.ad);
                System.out.println("Ortalama: "+temp.next.ort);
                System.out.println("Durum: "+temp.next.durum);
                break;
            }
            temp = temp.next;
        }
        if (sonuc == false){
            System.out.println(numara+" Numaralı öğrenci kaydı yok.");
        }
    }
}
