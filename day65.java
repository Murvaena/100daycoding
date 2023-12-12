import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input ukuran array 2 dimensi
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();

        // Inisialisasi array 2 dimensi dengan tipe data string
        String[][] array2D = new String[baris][kolom];

        // Input elemen-elemen array dari pengguna
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen untuk baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                array2D[i][j] = scanner.next();
            }
        }

        // Menampilkan array 2 dimensi
        System.out.println("Array 2 Dimensi:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}
