public class day54 {
    public static void main(String[] args) {
        int[][] array2d = {
            {1, 2, 3},
            {7, 8, 9},
            {20, 12, 6}
        };

        int nilaiTerbesar = cariNilaiTerbesar(array2d);
        System.out.println("nilai terbesarnya adalah: " + nilaiTerbesar);
    }

    static int cariNilaiTerbesar(int[][] array2d) {
        int nilaiTerbesar = Integer.MIN_VALUE;

        for (int[] baris : array2d) {
            for (int nilai : baris) {
                if (nilai > nilaiTerbesar) {
                    nilaiTerbesar = nilai;
                }
            }
        }

        return nilaiTerbesar;
    }
}
