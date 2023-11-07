
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class day30 {
    public static void main(String[] args) {
        
        //nomor 2
        Scanner input = new Scanner(System.in);
    
        System.out.print("nama depan           : ");
        String namaDepan = input.nextLine();
        
        
        System.out.print("nama belakang        : ");
        String namaBelakang = input.nextLine();
        
        
        System.out.print("masukkan umur        : ");
        int umur = input.nextInt();
        
        
        System.out.print("masukkan berat badan : ");
        double  beratBadan = input.nextDouble();
        
        
        System.out.print("masukkan tinggi Badan: ");
        double tinggiBadan = input.nextDouble();
        
        System.out.print("masukkan ukuran baju :  ");
        char ukuranBaju = input.next().charAt(0);
        
        System.out.print("status pernikahan  : ");
        boolean statusPernikahan = input.nextBoolean();
        
        
        
        //tampilkan hasil 
        System.out.println("nama depan           : "+namaDepan);
        System.out.println("nama belakang        : "+namaBelakang);
        System.out.println("masukkan umur        : "+umur );
        System.out.println("masukkan berat badan : "+beratBadan +"kg" );
        System.out.println("masukkan tinggi badan: "+tinggiBadan +"cm");
        System.out.println("masukkan ukuran baju : "+ukuranBaju);
        System.out.println("status pernikahan    : "+statusPernikahan);
        
       
        
        
        
       }
        
    
}
