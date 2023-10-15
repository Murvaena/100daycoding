import java.util.Scanner;

public class day7 {

    public static void main(String[] args) {

        // membuat variabel dan Scanner
        int nilai;
        String nama;
        try (Scanner scan = new Scanner(System.in)) {
            // mengambil input
            System.out.print("Nama: ");
            nama = scan.nextLine();
            System.out.print("Nilai: ");
            nilai = scan.nextInt();
        }

        // cek  lulus atau tidak
        if( nilai >= 70 ) {
            System.out.println("Selemat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }

    }

}