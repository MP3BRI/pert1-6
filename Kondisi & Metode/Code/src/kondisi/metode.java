package kondisi;

public class metode {

    //
    static void profil(String nama) {
        System.out.println("saya adalah mahasiswa bernama " + nama);
    }

    static void jobdess(String deskripsi) {
        System.out.println("Job dec saya adlah " + deskripsi);
    }

    static int hitung(int umur, int lamakerja) {
        return umur + lamakerja;       
    }

    //

    public static void main(String[] args) {
        profil("asu");
        profil("ngangggur");

        int totalgaji = hitung(25, 5);
        System.out.println(totalgaji + "juta");
    }
}
