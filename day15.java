import java.util.Scanner;

public  class day15{
    public static void main(String[] args) {
        //belajar kembali inputan 
        //berikan masukkan/komentar kepada saya apabila ada yang keliru 
        


        Scanner input = new Scanner(System.in);
        //scanner input=new scanner (System.in); ini digunakan untuk meminta inputan
        System.out.print("masukkan nama : ");
        String nama = input.nextLine();
        

        System.out.print("Umur anda : ");
        int umur = input.nextInt();
        input.nextLine();
     

        System.out.print("masukkan nama Ibu : ");
        String namaIbu = input.nextLine();
        


        System.out.print("masukkan tahun lahir: ");
        int tahunLahir = input.nextInt();

        System.out.println("=======DATA DIRI=======");
        input.close();
       




        }
    }
