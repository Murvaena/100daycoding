import java.util.Scanner;

public class day21 {

    public static void main(String[] args) {

        //belajar ternary  operator
        
        int nilai, x;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah nilai: ");
        nilai = input.nextInt();
            
            //statment pertama ( nilai * nilai)
            //statment kedua (nilai/2))
            //jika nilai yang diinput 8 maka yang di eksekusi adalah statment pertama yaitu ( nilai * nilai)
            //jika nilai yang di input bukan 8 maka yang di ekseskusi adalah statment kedua (nilai/2)
        x = (nilai == 8) ? (nilai * nilai) : (nilai / 2);

        System.out.println("Hasilnya: " + x);

        // Menutup Scanner (tidak wajib, tetapi disarankan)
        input.close();
    }
}

