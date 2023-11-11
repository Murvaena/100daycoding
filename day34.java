

//Jika nilai yang diinput adalah bilangan genap, 
//maka program akan menampilkan pesan genap dan kemudian 
//meminta user untuk memasukkan kembali angka.
//2. Jika nilai yang diinput adalah ganjil, maka program 
//akan menampilkan pesan "ganjil" dan tidak menerima 
//inputan angka lagi
import java.util.Scanner;

public class day34{

    public static void main(String[] args) {
        // Deklarasi variabel
        int bilangan;

        // Input bilangan
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan bilangan: ");
            bilangan = input.nextInt();

            // Cek bilangan genap atau ganjil
            if (bilangan % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("ganjil");
                break;
            }
        } while (true);
    }
}


    

