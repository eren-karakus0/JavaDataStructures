public class Main {
    public static void main(String[] args) {

        Sinif A = new Sinif();      //Bellekte düğüm oluşturma
        Sinif B = new Sinif();
        Sinif C = new Sinif();

        A.sayi = 11;        //Düğümlere değer ataması
        B.sayi = 22;
        C.sayi = 33;

        A.next = B;         //Düğümleri bağlama
        B.next = C;
        C.next = null;

        Sinif temp = A;

        while(temp != null){
            System.out.println(temp.sayi);      //Düğümler üzerinde dolaşma
            temp = temp.next;
        }


    }
}