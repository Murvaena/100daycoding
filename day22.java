
import java.util.Scanner;
public class day22 {
     public static void main(String[] args) {

        //belajar perulangan while

       Scanner input=new Scanner(System.in);
       int bilangan=1;

        //jika nilai yang di masukkan bukan 0 maka perulangan akan terus berlanjut hingga kita memasukkan angka 0
        while (bilangan!=0){
            System.out.print("Masukkan Bilangan 0 : ");
            bilangan=input.nextInt();
        }     
    } 
}