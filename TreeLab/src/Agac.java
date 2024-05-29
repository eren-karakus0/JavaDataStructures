public class Agac {
    Node kok;

    public Agac() {
        kok = null;
    }

    void ekle(int veri) {
        kok = ekleDugum(kok, veri);
    }

    Node ekleDugum(Node dugum, int veri) {
        if (dugum == null) {
            dugum = new Node(veri);
            return dugum;
        }

        if (veri &lt; dugum.veri) {
            dugum.sol = ekleDugum(dugum.sol, veri);
        } else if (veri &gt; dugum.veri) {
            dugum.sag = ekleDugum(dugum.sag, veri);
        }

        return dugum;
    }

    void inorder(Node dugum) {
        if (dugum != null) {

            inorder(dugum.sol);
            System.out.print(dugum.veri + &quot; &quot;);
            inorder(dugum.sag);
        }
    }

    void preorder(Node dugum) {
        if (dugum != null) {
            System.out.print(dugum.veri + &quot; &quot;);
            preorder(dugum.sol);
            preorder(dugum.sag);
        }
    }

    void postorder(Node dugum) {
        if (dugum != null) {
            postorder(dugum.sol);
            postorder(dugum.sag);
            System.out.print(dugum.veri + &quot; &quot;);
        }

    }
    void inorder() {
        inorder(kok);
    }

    void preorder() {
        preorder(kok);
    }

    void postorder() {
        postorder(kok);

    }
    int enKucukDegeriBul(Node dugum) {
        int enKucuk = dugum.veri;
        while (dugum.sol != null) {
            enKucuk = dugum.sol.veri;
            dugum = dugum.sol;
        }
        return enKucuk;
    }