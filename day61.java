public class day61 {
    public static void main(String[] args) {
        // Tentukan ukuran array
        int baris = 5;
        int kolom = 5;

        // Buat array 2 dimensi dengan tipe data boolean
        boolean[][] arrayBoolean = new boolean[baris][kolom];

        // Isi array 
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                // Jika i dan j genap atau ganjil (true) jika tidak ( false)
                arrayBoolean[i][j] = (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0);
            }
        }
        // Tampilkan isi array
        System.out.println("Isi dari Array 2 Dimensi :");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arrayBoolean[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
