import java.util.Scanner;

public class day33{
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int angka = input.nextInt();

        if
        (angka % 3 == 0){
            System.out.println("pride of 3");

        }if
        (angka % 5 == 0 ){
             System.out.println("pride of 5");
        

        } if
        (angka % 5 == 0 &&  angka % 3 == 0 ){

            System.out.println("pride of master");

        }
    }
}