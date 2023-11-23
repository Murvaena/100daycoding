public class day46{
    public static void main(String[] args) {
        
        int [][] array2d = {
            {1, 2, 3, 4, 5},//baris 0
            {6, 7, 8, 9, 10},//baris1
            {11, 12, 13, 14},//baris2
            {15, 16, 17, 18},//baris3

        };
        
        for( int baris = 0; baris < array2d.length ; baris++){
            for ( int kolom =0 ; kolom < array2d[baris].length ; kolom++){
                System.out.print(array2d[baris][kolom]+" ");

            }
            System.out.print("\n"); 
            
        }
    }
}