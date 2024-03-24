public class Node {
    String tc;
    String ad;
    String soyad;
    String mezunBolum;
    Node next;

    public Node(String tc, String ad, String soyad, String mezunBolum) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.mezunBolum = mezunBolum;
        next = null;
    }
}
