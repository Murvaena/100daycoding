import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scanner.nextInt();

    
        int[] arrayAngka = new int[jumlahElemen];

        
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayAngka[i] = scanner.nextInt();
        }

        
        System.out.print("Isi array: ");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print(arrayAngka[i] + " ");
        }

      
    }
}
