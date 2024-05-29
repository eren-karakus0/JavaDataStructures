import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 9);
        tree.root = tree.insert(tree.root, 25);

        System.out.print("preOrder: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("inOrder: ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("postOrder: ");
        tree.postOrder(tree.root);
        System.out.println();

        System.out.println("Ağacın yüksekliği: "+tree.height(tree.root));
        System.out.println("Eleman sayısı: "+tree.size(tree.root));
        System.out.println("Kök düğüm: "+tree.root.data);

        tree.root = tree.delete(tree.root, 5);
        tree.root = tree.delete(tree.root, 10);
        System.out.println("Silme işleminden sonra: ");

        System.out.print("preOrder: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("inOrder: ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("postOrder: ");
        tree.postOrder(tree.root);
        System.out.println();

        System.out.println("Ağacın yüksekliği: "+tree.height(tree.root));
        System.out.println("Eleman sayısı: "+tree.size(tree.root));
        System.out.println("Kök düğüm: "+tree.root.data);
    }
}