import java.util.Scanner;

public class day12 {
    public static void main (String[]args){
        
          //contoh soal
         //  idak ada potongan jika total pembelian kurang dari Rp. 50.000,-
         //Jika total pembelian lebih dari atau sama dengan Rp. 50.000,- potongan
  

        // membuat variabel belanja dan scanner
       double totalBelanja, diskon=0, jumlah_Pembayaran=0;
       Scanner input = new Scanner(System.in);
       System.out.print("Total Pembelian Rp. ");
       
        totalBelanja = input.nextDouble();
        if (totalBelanja >= 50000)
            diskon = 0.2 * totalBelanja;
        System.out.println("Besarnya Potongan Rp. " + diskon);
        
         if (totalBelanja < 50000)
        System.out.println("tidak ada potongan"+diskon);
        
        jumlah_Pembayaran =  totalBelanja- diskon;
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlah_Pembayaran);
  }
}
    
    

