//~~~~ Fig. 3.8 CLASS AVERAGE ~~~~//
import java.util.Scanner;

public class ClassAverage2 {
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
        int total = 0; //inisialisasi jumlah nilai
        int gradeCounter = 0; //inisialisasi jumlah nilai yang telah dimasukkan sejauh ini

        //tahap pemrosesan
        //meminta masukan dan membaca nilai dari pengguna
        System.out.print("Masukkan nilai atau -1 untuk keluar: "); 
        int grade = input.nextInt(); 

        //lakukan perulangan sampai nilai penanda dibaca dari pengguna
        while (grade != -1) { 
            total = total + grade; //tambahkan nilai ke total
            gradeCounter = gradeCounter + 1; //menambah penghitung

            //meminta masukan dan membaca nilai berikutnya dari pengguna
            System.out.print("Masukkan nilai atau -1 untuk keluar: ");
            grade = input.nextInt();
        }

        //tahap terminasi
        //jika pengguna memasukkan setidaknya satu nilai...
        if (gradeCounter != 0) {
            //gunakan angka dengan titik desimal untuk menghitung rata-rata nilai
            double average = (double) total / gradeCounter;

            //tampilkan total dan rata-rata (dengan dua digit presisi)
            System.out.printf("%nTotal dari %d nilai yang dimasukkan adalah %d%n", gradeCounter, total);
            System.out.printf("Rata-rata dari semua nilai adalah %.2f%n", average);
        }
        else { // tidak ada nilai yang dimasukkan, jadi tampilkan pesan yang sesuai
            System.out.println("Tidak ada nilai yang dimasukkan");
        }
        input.close(); //menutup Scanner
    }
}
