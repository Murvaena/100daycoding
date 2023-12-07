public class day60 {
    public static void main(String[] args) {
        int[] nilai = {1, 2, 3, 4, 5};

        int nilaiMaksimum = nilai[0];

        for (int i = 1; i < 5; i++) {
            if (nilai[i] > nilaiMaksimum) {
                nilaiMaksimum = nilai[i];
            }
        }

        System.out.println("Nilai maksimum: " + nilaiMaksimum);
    }
}
