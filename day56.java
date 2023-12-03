public class day56 {

    // Fungsi untuk menentukan nilai genap
    public static boolean isGenap(int nilai) {
        return nilai % 2 == 0;
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi
        int nilai1 = 10;
        int nilai2 = 15;

        if (isGenap(nilai1)) {
            System.out.println(nilai1 + " adalah nilai genap.");
        } else {
            System.out.println(nilai1 + " adalah nilai ganjil.");
        }

        if (isGenap(nilai2)) {
            System.out.println(nilai2 + " adalah nilai genap.");
        } else {
            System.out.println(nilai2 + " adalah nilai ganjil.");
        }
    }
}
