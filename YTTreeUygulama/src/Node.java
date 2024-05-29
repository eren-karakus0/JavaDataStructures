public class Node {
    int no, not;
    String ad;
    Node left;
    Node right;
    public Node(){
        no = 0;
        ad = "";
        not = 0;
        left = null;
        right = null;
    }
    public Node(int no, String ad, int not) {
        this.no = no;
        this.not = not;
        this.ad = ad;

        left = null;
        right = null;
    }
}
