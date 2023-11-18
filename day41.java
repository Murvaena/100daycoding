
import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan anngka pertama : ");
        int angka1 = input.nextInt();
        
        System.out.print("masukkan angka kedua : ");
        int angka2 = input.nextInt();
        
        int total = angka1 + angka2;
        System.out.println(total);
        
        //jika hasil genap maka akan di tambah 1 
        //jika hasilnya ganjil maka di tambah 2
        if (  total % 2 == 0){
            total +=1; 
            System.out.println("genap maka di tambah 1 = " +total);
      
        }
        else {
            total +=2; 
            System.out.println("ganjil maka di tambah 2 = " +total);
                
            
        }
        
    }
    
    
}
