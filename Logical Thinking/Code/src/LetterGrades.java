//~~~~ Fig. 4.9 LETTER GRADES ~~~~//

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {

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
        int aCount = 0; //jumlah A
        int bCount = 0; //jumlah B
        int cCount = 0; //jumlah C
        int dCount = 0; //jumlah D
        int fCount = 0; //jumlah F
        
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n  %s%n", "Masukkan nilai ujian antara 0 dan 100.", "Ketik penanda akhir berkas untuk mengakhiri masukan.", "Pada UNIX/Linux/macOS, ketik <Ctrl> d lalu tekan Enter", "Pada Windows, ketik <Ctrl> z lalu tekan Enter");

        //lakukan perulangan sampai pengguna memasukkan penanda akhir berkas (end-of-file)
        while (input.hasNext()) {
            int grade = input.nextInt(); //membaca nilai ujian
            total += grade; //menambahkan nilai ke total
            ++gradeCounter; //menambahkan 1 ke pencacah

            //menentukan nilai huruf yang sesuai dengan nilai ujian
            switch (grade / 10) {
                case 9: //nilai antara 90 dan 99
                case 10: //nilai 100
                    ++aCount; //menambahkan 1 ke jumlah A
                    break; //keluar dari switch
                case 8: //nilai antara 80 dan 89
                    ++bCount; //menambahkan 1 ke jumlah B
                    break; //keluar dari switch
                case 7: //nilai antara 70 dan 79
                    ++cCount; //menambahkan 1 ke jumlah C
                    break; //keluar dari switch
                case 6: //nilai antara 60 dan 69
                    ++dCount; //menambahkan 1 ke jumlah D
                    break; //keluar dari switch
                default: //nilai kurang dari 60
                    ++fCount; //menambahkan 1 ke jumlah F
                    break; //keluar dari switch
            }
        }

        //tampilkan laporan nilai
        System.out.printf("%ngrade Report:%n");

        //jika pengguna memasukkan setidaknya satu nilai...
        if (gradeCounter != 0) {
            //gunakan angka dengan titik desimal untuk menghitung rata-rata nilai
            double average = (double) total / gradeCounter;

            //ringkasan hasil
            System.out.printf("Total dari %d nilai yang dimasukkan adalah %d%n", gradeCounter, total);
            System.out.printf("Rata-rata dari semua nilai adalah %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Jumlah dari setiap nilai adalah:", "Jumlah A: ", aCount, "Jumlah B: ", bCount, "Jumlah C: ", cCount, "Jumlah D: ", dCount, "Jumlah F: ", fCount);
        }
        else { // tidak ada nilai yang dimasukkan, jadi tampilkan pesan yang sesuai
            System.out.println("Tidak ada nilai yang dimasukkan");
        }
        input.close(); //menutup Scanner
    }
}