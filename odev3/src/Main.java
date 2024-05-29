public class Main {
    public static void main(String[] args) {
        TelefonRehberi rehber = new TelefonRehberi();
        rehber.ekle("Harvey", "545 4443322");
        rehber.ekle("Mike", "535 8358217");
        rehber.ekle("Jessica", "555 1234568");
        rehber.ekle("Donna", "544 4567892");
        rehber.ekle("Louis", "545 3699512");
        rehber.ekle("Louis", "545 3699512");
        rehber.ara("Harvey");
        rehber.ara("Katherina");
        rehber.sil("Donna");
        // Çakışma durumunu çözmek için (zincirleme yöntemiyle) LinkedList tanımlandı ve böylece aynı hash değerine
        // sahip öğeler birbirine bağlanmış oldu.
        // Ekleme, arama ve silme işlemleri çakışma durumlarını dikkate alacak şekilde bu bağlı listeler üzerinde gerçekleştirilidi.
    }
}
