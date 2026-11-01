import java.util.Scanner;

public class MaximumFinder {
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

        //meminta dan memasukkan tiga nilai titik mengambang (floating-point)
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //
        double result = maximum(number1, number2, number3);

        //
        System.out.println("Maximum is: " + result);

        input.close();
    }

    //
    public static double maximum(double x, double y, double z) {
        double maximumValue = x;

        //
        if (y > maximumValue) {
            maximumValue = y;
        }

    //
    if (z > maximumValue) {
        maximumValue = z;
    }

    return maximumValue;
    }
}