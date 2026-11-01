package kondisi;

public class kondisi1 {
    public static void main(String[] args) {
        
        int umur = 13;
        boolean tiket = true;

        if (umur > 17 && tiket) {
            System.out.println("masuk studio");
        } else if (umur < 15) {
            System.out.println("tidak masuk");
        } else

        {
            System.out.println("masuk dengan penagwasan");
        }
    }
}