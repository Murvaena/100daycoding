public class day26{
    public static void main(String[] args) {
        //deklarasi array non primitif 

        //inisialisasi elemen elemen array

        String[] sahabat = new String[5];
        sahabat[0] = "vaena";
        sahabat[1] = "suci";
        sahabat[2] = "nuki";
        sahabat[3] = "Ani";
        sahabat[4] = "ardimansyah";

        //tampilkan isis array
        for (int i = 0; i < sahabat.length; i++ ){

            System.out.println("nama nama shabat  " + (i + 1) + ": " + sahabat [i]);
        }

    }
}