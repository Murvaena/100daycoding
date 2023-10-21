import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
    
        // Program memeriksa kata sandi yang kuat yang dimasukkan pengguna
        // Syarat kata sandi termasuk huruf kecil, besar, dan angka
        // Berikan pesan kata sandi kuat jika memenuhi syarat angka dan huruf kata sandi, jika tidak berikan pesan kata sandi lemah

        Scanner scan = new Scanner(System.in);
        String kataSandi;

        System.out.print("Masukkan kata sandi: ");
        kataSandi = scan.nextLine();

        if (kataSandi.length() >= 8 && kataSandi.matches(".*[a-z].*") && kataSandi.matches(".*[A-Z].*") && kataSandi.matches(".*[0-9].*")) {
            System.out.println("Kata sandi anda kuat: " + kataSandi);
        } else {
            System.out.println("Kata sandi anda lemah: " + kataSandi);
        }
    }
}
