public class day62 {
    public static void main(String[] args) {
        // Deklarasikan dan inisialisasikan array
        int[] angka = {4, 2, 7, 1, 9, 5};

        // Algoritma bubble sort
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] > angka[j]) {
                    // Tukar elemen jika berada dalam urutan yang salah
                    int temp = angka[i];
                    angka[i] = angka[j];
                    angka[j] = temp;
                }
            }
        }

        // Cetak array yang sudah diurutkan
        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }
    }
}
