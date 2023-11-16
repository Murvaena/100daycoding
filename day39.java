import java.util.Scanner;

public class day39{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka1 = 10;
        int angka2 = 10;

        System.out.println("Pilih operasi aritmetika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        //menentukan pilihan 
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();

        // Melakukan operasi aritmetika s
        if (pilihan == 1) {
            int hasil = angka1 + angka2;
            System.out.println("Hasil Penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            int hasil = angka1 - angka2;
            System.out.println("Hasil Pengurangan: " + hasil);
        } else if (pilihan == 3) {
            int hasil = angka1 * angka2;
            System.out.println("Hasil Perkalian: " + hasil);
            
        //jika memilih selain dari 3 pilhan maka hasilnya tidak ada 
        } else {
            System.out.println("Pilihan tidak valid.");
        }

       
    }
}
