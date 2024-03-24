public class Main {
    public static void main(String[] args) {

        ListeYapisi liste = new ListeYapisi();
        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);

        System.out.println();
        liste.yazdir();


    }
}