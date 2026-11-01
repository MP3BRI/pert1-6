package Quiz;
import java.util.Scanner;

// 
public class kondisi {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

// studio untuk umur 21+

    System.out.print("Masukkan umur: ");
    int umur = input.nextInt();
    
    boolean tiket = true;

//

if (umur > 17 && tiket) {
    System.out.println("masuk studio"); // jalan
    } else if (umur > 15) {
    System.out.println("dengan pengawasan"); // jalan
    } else 

    {
    System.out.println("tidak masuk"); // jalan
    }
    input.close();
    }
}

