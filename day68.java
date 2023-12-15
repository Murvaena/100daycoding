public class day68 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi matriks
        int[][] matriksA = {{1, 2}, {3, 4}};
        int[][] matriksB = {{5, 6}, {7, 8}};
        int[][] hasil = new int[2][2];

        // Penjumlahan matriks
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil
        System.out.println("Matriks Hasil:");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
