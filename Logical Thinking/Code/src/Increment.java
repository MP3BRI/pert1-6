//~~~~ Fig. 3.13 INCREMENT ~~~~//
import java.util.Scanner;

public class Increment {
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

        //menunjukkan operator increment postfix
        int c = 5; //inisialisasi c
        System.out.printf("c sebelum increment: %d%n", c); //menampilkan nilai c
        System.out.printf("penambahan pasca: %d%n", c++); //menampilkan c lalu menambahkan 1 ke c
        System.out.printf("c setelah increment: %d%n", c); //menampilkan nilai c

        System.out.println(); //mencetak baris kosong

        //menunjukkan operator increment prefix
        c = 5; //menginisialisasi ulang c
        System.out.printf("c sebelum increment: %d%n", c); //menampilkan nilai c
        System.out.printf("penambahan awal: %d%n", ++c); //menambahkan 1 ke c lalu menampilkan c
        System.out.printf("c setelah increment: %d%n", c); //menampilkan nilai c

        input.close(); //menutup Scanner
    }
}