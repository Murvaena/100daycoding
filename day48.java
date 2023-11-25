public class day48{
    public static void main(String[] args) {
        // Membuat dua array
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Mengecek apakah kedua array memiliki panjang yang sama
        if (array1.length != array2.length) {
            System.out.println("Panjang kedua array harus sama untuk dapat dijumlahkan.");
            return;
        }

        // Membuat array hasil penjumlahan
        int[] hasil = new int[array1.length];

        // Melakukan penjumlahan array
        for (int i = 0; i < array1.length; i++) {
            hasil [i] = array1[i] + array2[i];
        }

        // Menampilkan hasil penjumlahan
        System.out.print("Hasil penjumlahan array: ");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
}
