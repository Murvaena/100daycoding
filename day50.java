import java.lang.reflect.Array;

public class day50 {
    public static void main(String[] args) {
        int [] penjumlahanArray = {9, 8, 7, 6, 5, 4,3};
        
        int total = 0 ;

        for(int i = 0; i < penjumlahanArray.length; i++){
        total += penjumlahanArray[i];

        }
         System.out.println("total penjumlahan nilai pada elemen array: "+total);


         System.out.println("===GANJIL ATAU GENAP=====");

         if (total % 2 ==0){
            System.out.println("GENAP");
         }else
            System.out.println("GANJIL");
         {
            
         }

        
    }
}
