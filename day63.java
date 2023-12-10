public class day63 {
    public static void main(String[] args) {
        // Deklarasi array
        int[] angka = {10, 20, 30, 40, 50};

        // Menhitung jumlah bilangan ganjil
        int jumlahGanjil = 0;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 != 0) {
                jumlahGanjil++;
            }
        }

        // Mencetak jumlah bilangan ganjil
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}