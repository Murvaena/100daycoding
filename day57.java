public class day57{

    // Fungsi dengan percabangan if
    public static void cekPositifNegatif(int angka) {
        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif.");
        } else {
            System.out.println(angka + " adalah nol.");
        }
    }

    public static void main(String[] args) {
        // Memanggil fungsi dengan percabangan if
        cekPositifNegatif(5);
        cekPositifNegatif(-3);
        cekPositifNegatif(0);
    }
}
