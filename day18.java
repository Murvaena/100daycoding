import java.util.Scanner;

public class day18{
    public static void main(String[] args) {
        //belajar operator pembanding 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai A: ");
        int nilaiA = input.nextInt();
        System.out.print("Masukkan nilai B: ");
        int nilaiB = input.nextInt();
        
        boolean hasil;

        hasil = nilaiA > nilaiB;
        System.out.println("A lebih besar dari B?: " + hasil);

        hasil = nilaiA < nilaiB;
        System.out.println("A lebih kecil dari B?: " + hasil);

        hasil = nilaiA >= nilaiB;
        System.out.println("A lebih besar atau sama dengan B?: " + hasil);

        hasil = nilaiA <= nilaiB;
        System.out.println("A lebih kecil atau sama dengan B?: " + hasil);

        hasil = nilaiA == nilaiB;
        System.out.println("A sama dengan B?: " + hasil);

        hasil = nilaiA != nilaiB;
        System.out.println("A tidak sama dengan B?: " + hasil);
    }
}

             
            
        
        
    