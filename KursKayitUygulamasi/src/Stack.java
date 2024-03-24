import java.util.Scanner;

public class Stack {
    Scanner scanner = new Scanner(System.in);
    int kontenjan;
    int sayac;
    Node top;
    public Stack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayac = 0;
        top = null;
    }
    String tc;
    String ad;
    String soyad;
    String mezunBolum;
    public void push(){
        System.out.println("Kursa kaydedilecek kişi belgeleri: ");
        System.out.println("TC no: "); tc = scanner.nextLine();
        System.out.println("Ad: "); ad = scanner.nextLine();
        System.out.println("Soyad: "); soyad = scanner.nextLine();
        System.out.println("Mezun olunan bölüm: "); mezunBolum = scanner.nextLine();

        Node eleman = new Node(tc, ad, soyad, mezunBolum);
        if (isFull()){
            System.out.println("Kurs kontenjanı dolu. ");
        }
        else{
            if (isEmpty()){
                top = eleman;
                System.out.println(tc+" numaralı kişi ilk kayıt olarak eklendi.");
            }
            else{
                eleman.next = top;
                top = eleman;
                System.out.println(tc+" numaralı kişi kursa eklendi. ");
            }
            sayac++;
        }
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Kayıtlı kimse yok.");
        }
        else{
            System.out.println(tc+" numaralı kişi silindi.");
            top = top.next;
            sayac--;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Kayıtlı kimse yok.");
        }
        else{
            Node temp = top;
            System.out.println("Kursta kayıtlı kişi listesi");
            System.out.println("TCno\tAd\tSoyad\tMezun Bölüm");

            while (temp != null){
                System.out.println(temp.tc+"\t"+temp.ad+"\t"+temp.soyad+"\t"+temp.mezunBolum);
                temp = temp.next;
            }
        }
    }
    public void esSonKayit(){
        if (isEmpty()){
            System.out.println("Kayıtlı kimse yok. ");
        }
        else{
            System.out.println(top.tc+"\t"+top.ad+"\t"+top.soyad+"\t"+top.mezunBolum);
        }
    }
    public void kalanKontenjanSayisi(){
        System.out.println("Toplam kayıtlı kişi sayısı: "+sayac);
        System.out.println("Kalan kontenjan sayısı: "+(kontenjan - sayac));
    }
    boolean isEmpty(){
        return sayac == 0;
    }
    boolean isFull(){
        return sayac == kontenjan;
    }
}
