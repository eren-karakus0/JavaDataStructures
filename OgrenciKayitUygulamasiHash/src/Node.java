public class Node {
    int numara; //key
    String ad;
    int ort;
    String durum;
    Node next;

    public Node() {
        next = null;
    }
    public Node(int numara, String ad, int ort) {
        this.numara = numara;
        this.ad = ad;
        this.ort = ort;
        this.durum = ort < 50 ? "Kaldı" : "Geçti";
        next = null;
    }
}
