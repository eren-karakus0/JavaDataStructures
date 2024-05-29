public static void main(String[] args) {
// TODO code application logic here
        Agac agac = new Agac();

        agac.ekle(50);
        agac.ekle(30);
        agac.ekle(70);
        agac.ekle(20);
        agac.ekle(40);
        agac.ekle(60);
        agac.ekle(90);
        System.out.println(&quot;Inorder traversal:&quot;);
        agac.inorder();

        System.out.println(&quot;\nPreorder traversal:&quot;);
        agac.preorder();

        System.out.println(&quot;\nPostorder traversal:&quot;);
        agac.postorder();
        System.out.println(&quot;&quot;);
        System.out.println(agac.degeriAra(agac.kok, 90));
        System.out.println(agac.degeriAra(agac.kok, 80));
        System.out.println(agac.enKucukDegeriBul(agac.kok));

        }