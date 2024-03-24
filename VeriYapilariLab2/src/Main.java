public class Main {
    public static void main(String[] args) {

        BagliListe bagliListe = new BagliListe();
        bagliListe.sonaElemanEkle(10);
        bagliListe.sonaElemanEkle(20);
        bagliListe.sonaElemanEkle(30);
        bagliListe.yazdir();
        System.out.println();
        bagliListe.basaElemanEkle(3);
        bagliListe.basaElemanEkle(5);
        bagliListe.basaElemanEkle(7);
        bagliListe.sonaElemanEkle(40);
        bagliListe.yazdir();
        bagliListe.elemanSayisi();
        bagliListe.elemanSil(2);
        bagliListe.yazdir();
    }

}