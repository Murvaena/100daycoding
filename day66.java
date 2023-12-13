import java.util.ArrayList;

public class day66 {
    public static void main(String[] args) {
        // Membuat ArrayList 2D
        ArrayList<ArrayList<Integer>> array2D = new ArrayList<>();

        // Menambahkan baris pertama
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        array2D.add(row1);

        // Menambahkan baris kedua
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        array2D.add(row2);

        // Menampilkan isi array 2D
        for (ArrayList<Integer> row : array2D) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
