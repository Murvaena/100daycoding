import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        String laluLintas;
        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Masukkan warna: ");
        laluLintas = scan.nextLine();

        switch (laluLintas) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, jalan!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, hati-hati");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }
}
