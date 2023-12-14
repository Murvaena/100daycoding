public class day67 {
    public static void main(String[] args) {
        // Mendefinisikan array 2 dimensi
        int[][] array2D = new int[2][3]; // Ubah ukuran array menjadi [2][3]

        // Menginisialisasi nilai array
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;
        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6; // Tambahkan inisialisasi untuk array2D[1][2]

        // Menampilkan nilai array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] );
            }
            System.out.println();
        }
    }
}
