//~~~~ Fig. 4.1 WHILE COUNTER ~~~~//
public class WhileCounter {
    public static void main(String[] args) {

        //----- NAMA & NPM -----//
        System.out.println(" ───────────────────────────");
        System.out.println("NAMA : ? ");
        System.out.println(" ──────────────────────────────");

        System.out.println(" ─────────");
        System.out.println("NPM : ? ");
        System.out.println(" ────────────");

        int counter = 1; //deklarasikan dan inisialisasi variabel kontrol

        while (counter <= 10) { //kondisi kelanjutan perulangan
            System.out.printf("%d ", counter); //menampilkan nilai counter
            ++counter; //increment counter
        }
        System.out.println();
    }
}
    

