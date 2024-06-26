public class Tree {
    Node root;
    public Tree() {
        root = null;
    }

    Node newNode(int data){
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data){
        if (root != null){
            if (data < root.data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);
        }
        else
            root = newNode(data);
        return root;
    }

    void preOrder(Node root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(Node root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    void postOrder(Node root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    int height(Node root){
        if (root == null)
            return -1;
        else{
            int sol = 0;
            int sag = 0;
            sol = height(root.left);
            sag = height(root.right);
            if (sol > sag)
                return sol + 1;
            else
                return sag + 1;
        }
    }
    int size(Node root){
        if (root == null)
            return 0;
        else
            return size(root.left) + 1 + size((root.right));
    }

    Node delete(Node root, int data){
        Node temp1;
        Node temp2;
        if (root == null)
            return null;
        if (root.data == data){
            if (root.left == root.right){
                root = null;
                return null;
            }
            else if (root.left == null){
                temp1 = root.right;
                return temp1;
            }
            else if (root.right == null){
                temp1 = root.left;
                return temp1;
            }
            else{
                temp1 = temp2 = root.right;
                while (temp1.left != null){
                    temp1 = temp1.left;
                }
                temp1.left = root.left;
                return temp2;
            }
        }
        else {
            if (data < root.data){
                root.left = delete(root.left, data);
            }
            else {
                root.right = delete(root.right, data);
            }
        }
        return root;
    }


}
