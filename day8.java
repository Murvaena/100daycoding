
import java.util.Scanner;
public class day8{
    public static void main (String args[]){
        Scanner latihan = new Scanner(System.in);
        int  pilihan ;
        System.out.println("masukkan pilihan jurusan: ");
        pilihan = latihan.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("PENDIDIKAN AGAMA ISLAM");
            break;

            case 2:
                System.out.println("BAHASA ARAB");
            break;

            case 3:
                System.out.println("ILMU AL_QUR'AN DAN HADIS");
            break;

            case 4:
                System.out.println("MENEJEMEN SYARI'AH");
            break;

            default:
                System.out.println("pilihan salah: ");

        }
        //tutup objek latihan
        latihan.close();

    }
}