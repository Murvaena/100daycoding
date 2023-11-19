import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();

        
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2= scanner.nextDouble();

        // Percabangan untuk mengecek apakah pembagi (bilangan kedua) tidak sama dengan 0
        if (bilangan2 != 0) {
    
            // Melakukan pembagian dan menampilkan hasilnya
            double hasilPembagian = bilangan1/ bilangan2;
            System.out.println("Hasil pembagian: " + hasilPembagian);
        } else {
            // Menampilkan pesan kesalahan jika pembagi adalah 0
            System.out.println("Error: Pembagi tidak boleh nol (0).");
        }

        
    }
}
