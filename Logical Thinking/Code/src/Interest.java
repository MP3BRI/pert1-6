//~~~~ Fig. 4.6 INTEREST ~~~~//
public class Interest {
    public static void main(String[] args) {

        //----- NAMA & NPM -----//
        System.out.println(" ───────────────────────────");
        System.out.println("NAMA : ? ");
        System.out.println(" ──────────────────────────────");

        System.out.println(" ─────────");
        System.out.println("NPM : ? ");
        System.out.println(" ────────────");

        double principal = 1000.0; //jumlah awal sebelum bunga
        double rate = 0.05; //tingkat bunga

        //tampilkan tabel judul
        System.out.printf("%s%20s%n", "Tahun", "Jumlah di Deposito");

        //tampilkan jumlah di deposito untuk setiap tahun
        for (int year = 1; year <= 10; ++year) {
            //hitung jumlah di deposito setelah year tahun
            double amount = principal * Math.pow(1.0 + rate, year);

            //tampilkan tahun dan jumlah di deposito
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}