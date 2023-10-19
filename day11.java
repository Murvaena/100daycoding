import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner makanan = new Scanner(System.in);
        String pesanan  ;
        int pilihan;
        int harga = 0;
        int total = 0;
        int jumlahPesanan;

        System.out.println("==============DAFTAR MENU ==============");
        System.out.println("1. NASI GORENG      : 10,000");
        System.out.println("2. MIE AYAM         : 15,000");
        System.out.println("3. GADO-GADO        : 13,000");
        System.out.println("4. AYAM GEPREK      : 18,000");

        System.out.println("=====MASUKKAN PESANAN ANDA=====");
        System.out.print("Masukkan nomor menu (1-4): ");
        pilihan = makanan.nextInt();

        if (pilihan == 1) {
            pesanan = "Nasi Goreng";
            harga = 10000;
        } else if (pilihan == 2) {
            pesanan = "Mie Ayam";
            harga = 15000;
        } else if (pilihan == 3) {
            pesanan = "Gado-Gado";
            harga = 13000;
        } else if (pilihan == 4) {
            pesanan = "Ayam Geprek";
            harga = 18000;
        } else {
            pesanan = "Pilihan tidak valid";
        }

        System.out.print("Jumlah pesanan: ");
        jumlahPesanan = makanan.nextInt();

        if (harga != 0) {
            System.out.println("Menu yang Anda pesan: " + pesanan);
            System.out.println("Harga per porsi: " + harga);
            System.out.println("Jumlah pesanan: " + jumlahPesanan);
            total = harga * jumlahPesanan;
            System.out.println("Total harga semua pesanan: " + total);
        } else {
            System.out.println(pesanan);
        }

        makanan.close();
    }
}
