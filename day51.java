public class day51 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int panjangGabungan = array1.length + array2.length;
        int[] gabungan = new int[panjangGabungan];

        //System.arraycopy digunakan untuk  menyalin sebagian atau seluruh elemen dari suatu array ke array lainnya
        System.arraycopy(array1, 0, gabungan, 0, array1.length);
        System.arraycopy(array2, 0, gabungan, array1.length, array2.length);

        System.out.print("Array Gabungan: ");
        for (int nilai : gabungan) {
            System.out.print(nilai + " ");
        }
    }
}
