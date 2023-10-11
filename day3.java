public class day3 {
    public static void main(String[] args) {
        System.out.println("======== Konversi String ke tipe data primitif ========");
        
        // Konversi string ke int
        String nilai1 = "21";
        int strNilai1 = Integer.parseInt(nilai1);
        System.out.println("Konversi string ke int: " + strNilai1);

        // Konversi string ke byte
        String nilai2 = "100";
        byte strNilai2 = Byte.parseByte(nilai2);
        System.out.println("Konversi string ke byte: " + strNilai2);

        // Konversi string ke short
        String nilai3 = "32767";
        short strNilai3 = Short.parseShort(nilai3);
        System.out.println("Konversi string ke short: " + strNilai3);

        // Konversi string ke long
        String nilai4 = "1234567890";
        long strNilai4 = Long.parseLong(nilai4);
        System.out.println("Konversi string ke long: " + strNilai4);

        // Konversi string ke character
        String nilai5 = "V";
        char strNilai5 = nilai5.charAt(0);
        System.out.println("Konversi string ke char: " + strNilai5);

        // Konversi string ke boolean
        String nilai6 = "false";
        boolean strNilai6 = Boolean.parseBoolean(nilai6);
        System.out.println("Konversi string ke boolean: " + strNilai6);

        // Konversi string ke double
        String nilai7 = "1.47";
        double strNilai7 = Double.parseDouble(nilai7);
        System.out.println("Konversi string ke double: " + strNilai7);
        
        // Konversi string ke float
        String nilai8 = "6.80f";
        float strNilai8 = Float.parseFloat(nilai8);
        System.out.println("Konversi string ke float: " + strNilai8);
        
        System.out.println("====== Konversi tipe data primitif ke String ======");
        
        // Konversi boolean ke String
        boolean mahasiswa = true;
        String stringMahasiswa = Boolean.toString(mahasiswa);
        System.out.println("Konversi boolean ke String: " + stringMahasiswa);

        //konversi integer ke string
        int umur = 21;
        String stringUmur = Integer.toString(umur);
        System.out.println("konversi integer ke String: "+stringUmur);
    }
}
