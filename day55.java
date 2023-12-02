public class day55 {

    // Fungsi sederhana tanpa parameter dan tanpa nilai kembali
    public static void sapaan() {
        System.out.println("Halo");
    }

    // Fungsi dengan parameter
    public static void sapaanDenganNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }


    public static void main(String[] args) {
        // Memanggil fungsi sapaan
        sapaan();

        // Memanggil fungsi sapaanDenganNama dengan memberikan nilai parameter
        sapaanDenganNama("vaena ");

       
    }
}