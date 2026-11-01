//~~~~ Fig. 3.10 ANALYSIS JAVA ~~~~//
import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        //buat Scanner untuk memperoleh input dari jendela perintah
        Scanner input = new Scanner(System.in);

        //----- NAMA & NPM -----//
        System.out.println(" ───────────────────────────");
        System.out.println("NAMA : ? ");
        System.out.println(" ──────────────────────────────");

        System.out.println(" ─────────");
        System.out.println("NPM : ? ");
        System.out.println(" ────────────");

        //tahap inisialisasi
        int passes = 0; //jumlah siswa yang lulus
        int failures = 0; //jumlah siswa yang gagal
        int studentCounter = 1; //jumlah siswa yang sedang diproses

        //memproses 10 siswa menggunakan perulangan yang dikendalikan oleh pencacah
        while (studentCounter <= 10) {
            // meminta input dari pengguna dan mendapatkan nilai dari pengguna
            System.out.print("Masukkan hasil ujian (1 = lulus, 2 = gagal): ");
            int result = input.nextInt();

            //memeriksa apakah hasilnya adalah 1 atau 2
            if (result == 1) {
                passes = passes + 1; //menambahkan 1 ke jumlah siswa yang lulus
            }
            else {
                failures = failures + 1; //menambahkan 1 ke jumlah siswa yang gagal
            }

            //tambahkan nilai studentCounter agar perulangan pada akhirnya berhenti
            studentCounter = studentCounter + 1;
        }

        //tampilkan jumlah siswa yang lulus dan gagal
        System.out.printf("lulus: %d%nGagal: %d%n", passes, failures);

        //jika lebih dari 8 siswa lulus, tampilkan pesan tambahan
        if (passes > 8) {
            System.out.println("Selamat! Kelas ini sangat sukses!");
        }
        input.close(); //menutup Scanner
    }
}