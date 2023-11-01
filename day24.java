import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {


        //belajar array

        // deklarasi dan inisialisasi array
        String[] buah = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        //buah.lenght di gubnakan untuk mendapatkan jumlah elemen dalam array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String namaBUah : buah ){
            System.out.println(namaBUah);
        }
        
    }
    
}
