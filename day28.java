import java.util.Scanner;

public class day28{
    public static void main(String[] args) {
    
        //menampilkan angka 1 sampai 10 menggunakan 
        //perulangan

        Scanner inputan = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir;

        System.out.println("RANGE ANNGKA");
        System.out.println("masukkan nilai awal: ");
        nilaiAwal = inputan.nextInt();
        System.out.println(" masukkan nilai akhir: ");
        nilaiAkhir = inputan.nextInt();
    
        for(int  a = nilaiAwal ; a <= nilaiAkhir; a++){
            System.out.println(a);

        }

        
    }
}