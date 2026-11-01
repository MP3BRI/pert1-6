package Quiz;

import java.util.Scanner;

public class metode {

static void profil(String nama) {
    System.out.println("Nama saya adalah " + nama);
}

static void job(String isi) {
    System.out.println("Saya bekerja sebagai " + isi);
}

static double operator(double gaji, int pengeluaran, String operasi) {
    switch (operasi) {
        case "+":
            return gaji + pengeluaran;
        case "-":
            return gaji - pengeluaran;
        case "/":
            return (double) gaji / pengeluaran;
        default:
            throw new IllegalArgumentException("Operasi tidak valid");
    }
}

//
public static void main(String[] args) {

    profil("udin");
    job("begal");

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan gaji + masukkan pengeluaran: ");
    double gaji = input.nextDouble();
    String operator = input.next();
    int pengeluaran = input.nextInt();

    if (operator(gaji, pengeluaran, operator) > 0) {
        double sisa = operator(gaji, pengeluaran, operator);
        System.out.println("Hasil " + sisa);
    }
    


    input.close();
}


    
}
