public class day58 {
    public static void main(String[] args) {
        int[] data = {12, 8, 5, 20, 10};
        int target = 5;

        // melakukan pencarian elemen
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                index = i;
                break;
            }
        }

        // menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("Elemen " + target + " ditemukan pada index " + index);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array");
        }
    }
}
