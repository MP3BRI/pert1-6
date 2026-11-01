//~~~~ Fig. 2.15 COMPARISON ~~~~ //
import java.util.Scanner;

public class Comparison {
    // metode main memulai eksekusi aplikasi Java
    public static void main(String[] args) {
        // buat Scanner untuk memperoleh input dari baris perintah
        Scanner input = new Scanner(System.in);
        
        //----- NAMA & NPM -----//
       System.out.println(" ───────────────────────────");
        System.out.println("NAMA : ? ");
        System.out.println(" ──────────────────────────────");

        System.out.println(" ─────────");
        System.out.println("NPM : ? ");
        System.out.println(" ────────────");

        System.out.print("Masukkan bilangan bulat pertama: "); //prompt
        int number1 = input.nextInt(); // membaca bilangan bulat pertama dari pengguna

        System.out.print("Masukkan bilangan bulat kedua: "); //prompt
        int number2 = input.nextInt(); // membaca bilangan bulat kedua dari pengguna

        //--- Contoh Java kondisi & Makna kondisi dalam Java ---//
        // X == Y ----> X sama dengan Y
        // X != Y ----> X tidak sama dengan Y
        // X < Y -----> X lebih kecil dari Y
        // X > Y -----> X lebih besar dari Y
        // X <= Y ----> X lebih kecil atau sama dengan Y
        // X >= Y ----> X lebih besar atau sama dengan Y
        //----------------------------------------------------//

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
    
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
    
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
    
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
    
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
    
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        input.close(); // menutup Scanner
    }
}
