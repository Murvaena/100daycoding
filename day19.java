import java.util.Scanner;

public class day19{
    public static void main(String[] args) {
        //jika nilai di atas 70 atau sama dengan 70 dia akan lulus masuk perguruan tinggi  
        //jika nilai di bawah darri 70 dia tidak lulus masuk perguruan tinggi

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai anda: ");
        int nilai =input.nextInt();

    if (nilai >= 70){
        System.out.println("anda lulus masuk perguruan tinggi");
    }else{
        System.out.println("anda tidak lulus masuk perguruan tinggi");
    }



    }
}