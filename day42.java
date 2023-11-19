import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai 10: ");
        int nilai = scanner.nextInt();

        // Inisialisasi variabel untuk menyimpan jumlah bilangan genap
        int jumlahGenap = 0;

        // Perulangan untuk menghitung jumlah bilangan genap dari 1 hingga 10
        for (int i = 1; i <= nilai; i++) {
            // Percabangan untuk menentukan apakah bilangan tersebut genap
            if (i % 2 == 0) {
                jumlahGenap += i;
            }
        }

        // Menampilkan hasil jumlah bilangan genap
        System.out.println("Jumlah bilangan genap dari 1 hingga " + nilai + " adalah: " + jumlahGenap);

        // Menutup scanner
        scanner.close();
    }
}
