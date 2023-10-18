import java.util.Scanner;

public class day10
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gajiPokok = 0;
        int golongan;
        int lamaKerja;

        System.out.print("Masukkan golongan : ");
        golongan = input.nextInt();



        switch (golongan) {
            case 1:
                gajiPokok = 4000000;
                break;
            case 2:
                gajiPokok = 7000000;
                break;
            case 3:
                gajiPokok = 10000000;
                break;
            default:
                System.out.println("Golongan tidak valid.");
                System.exit(0);
        }

        System.out.print("berapa tahun sudah bekerja1: ");
        lamaKerja = input.nextInt();

        // bonus
        int bonus = 0;
        if (lamaKerja > 5) {
            bonus = (lamaKerja - 5) * 100000;
        }

        // Menghitung total gaji
        int totalGaji = gajiPokok + bonus;

        
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Gaji: " + totalGaji);

        input.close();
    }
}
