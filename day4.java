

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        
        //deklarasi
        String alamat, nama, hobi, bulanLahir, asalSekolah;
        int umur;
        
        //membuat scanner baru dengan nama biodata
        Scanner biodata= new Scanner(System.in);
        
        
        //data data yang akan diinput 
        System.out.print("Nama: ");
        nama = biodata.nextLine();

        System.out.print("Hobi: ");
        hobi = biodata.nextLine();

        System.out.print("Bulan lahir: ");
        bulanLahir = biodata.nextLine();

        System.out.print("Asal Sekolah: ");
        asalSekolah = biodata.nextLine();

        System.out.print("Alamat: ");
        alamat = biodata.nextLine();

        System.out.print("Umur: ");
        umur = biodata.nextInt();
        // scanner.nextInt/nexLine adalah fungsi untuk mengambil data

 

        // Menampilkan data yang disimpan di variabel
        System.out.println("Data yang Anda masukkan:");
        System.out.println("Nama: " + nama);
        System.out.println("Hobi: " + hobi);
        System.out.println("Bulan Lahir: " + bulanLahir);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Alamat: " + alamat);
        System.out.println("Umur: " + umur);

        biodata.close();//penutup objek scanner
    }
}

