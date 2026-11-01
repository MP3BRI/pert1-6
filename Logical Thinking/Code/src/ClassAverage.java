//~~~~ Fig. 3.6 CLASS AVERAGE ~~~~ //
import java.util.Scanner;

public class ClassAverage {
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
        int total = 0; //jumlah dari nilai-nilai yang dimasukkan pengguna
        int gradeCounter = 1; //jumlah dari nilai-nilai yang dimasukkan pengguna

        //tahap pemrosesan menggunakan iterasi yang dikendalikan oleh pencacah
        while (gradeCounter <= 10) { //loop 10 kali
            System.out.print("Masukkan nilai ujian: "); //prompt
            int grade = input.nextInt(); //membaca nilai ujian
            total = total + grade; //menambahkan nilai ke total
            gradeCounter = gradeCounter + 1; //menambahkan 1 ke pencacah
        }

        //tahap terminasi
        int average = total / 10; //pembagian bilangan bulat menghasilkan hasil berupa bilangan bulat

        //tampilkan total dan rata-rata nilai
        System.out.printf("%nTotal dari semua nilai adalah %d%n", total);
        System.out.printf("Rata-rata dari semua nilai adalah %d%n", average);

        input.close(); //menutup Scanner
    }
}
