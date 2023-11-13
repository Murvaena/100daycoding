import java.util.Scanner;

//menyimpan data menggunakan arry

public class day36 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int jumlah = 5;
       String[] items = new String[jumlah];

       System.out.println("Masukkan " + jumlah + " barang:");
       for (int i = 0; i < jumlah; i++) {
           items[i] = input.nextLine();
       }

       System.out.println("Daftar barang yang disimpan:");
       for (int i = 0; i < jumlah; i++) {
           System.out.println((i+1) + ". " + items[i]);
       }
   }
}