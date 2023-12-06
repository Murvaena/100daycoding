import java.util.Arrays;

public class day59 {
    public static void main(String[] args) {
        // Array A
        int[] arrayA = {1, 2, 3, 4};

        // Array B dengan ukuran yang sama
        int[] arrayB = new int[arrayA.length];

        // Menyalin elemen array A ke array B
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }

        // Menampilkan isi array A dan B
        System.out.println("Isi array A: " + Arrays.toString(arrayA));
        System.out.println("Isi array B setelah disalin dari array A: " + Arrays.toString(arrayB));
    }
}
