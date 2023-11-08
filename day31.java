import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai batas : ");
        
        int nilaiBatas = input.nextInt();
        int total = 0;
        for (int i = 0; i <=  nilaiBatas; i++) {
            total = total+ i;
            System.out.print(i+" + ");
            
        }
        System.out.println(" = "+total);
        
        
     
    }
    
}


    

