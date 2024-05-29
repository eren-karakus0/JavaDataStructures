import java.util.LinkedList;
class TelefonRehberi {
    private LinkedList<Entry>[] rehber;

    public TelefonRehberi() {
        this.rehber = new LinkedList[20];
        for (int i = 0; i < 20; i++) {
            rehber[i] = new LinkedList<>();
        }
    }

    public void ekle(String isim, String telefon) {
        int hashIndex = isim.charAt(0) % 20;
        for (Entry entry : rehber[hashIndex]) {
            if (entry.isim.equals(isim)) {
                System.out.println("İsim zaten rehberde bulunuyor.");
                return;
            }
        }
        rehber[hashIndex].add(new Entry(isim, telefon));
        System.out.println(isim + " rehbere eklendi.");
    }

    public void ara(String isim) {
        int hashIndex = isim.charAt(0) % 20;
        for (Entry entry : rehber[hashIndex]) {
            if (entry.isim.equals(isim)) {
                System.out.println(isim + ": " + entry.telefon);
                return;
            }
        }
        System.out.println(isim + " rehberde bulunamadı.");
    }

    public void sil(String isim) {
        int hashIndex = isim.charAt(0) % 20;
        for (Entry entry : rehber[hashIndex]) {
            if (entry.isim.equals(isim)) {
                rehber[hashIndex].remove(entry);
                System.out.println(isim + " rehberden silindi.");
                return;
            }
        }
        System.out.println(isim + " rehberde bulunamadı.");
    }

    private static class Entry {
        String isim;
        String telefon;

        Entry(String isim, String telefon) {
            this.isim = isim;
            this.telefon = telefon;
        }
    }
}