import java.util.Scanner;

public class day29 {
   
    public static void main(String[] args) {
       
         
        Scanner input = new Scanner(System.in);
        System.out.println("masunkkan angka: ");
        int angka = input.nextInt();
       
       
        for (int i = 1; i < angka; i++) {
            if ( i % 3 ==0){
                System.out.println(i);
            
        }
                    
                    
            
            
        }
    }
    
}
