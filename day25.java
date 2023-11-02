public class day25 {
    public static void main(String[] args) {
        

        //array tipe primitif 
        // Deklarasi dan inisialisasi array bertipe String
        float[] nilaiFloat = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f};
        
        System.out.println("=========FLOAT==========");
        // Mengakses dan mencetak elemen-elemen array nilaiFloat
        for (int i = 0; i < nilaiFloat.length; i++) {
            System.out.println("Nilai float " + (i + 1) + ": " + nilaiFloat[i]);
        }

        System.out.println("=========INTEGER==========");
        // Deklarasi dan inisialisasi array bertipe int
        int[] angka = {1, 2, 3, 4, 5};
        
        // Mengakses dan mencetak elemen-elemen array angka
        for (int i = 0; i < angka.length; i++) {
            System.out.println("int Angka " + (i + 1) + ": " + angka[i]);
        }

        System.out.println("=========BYTE==========");
        // Deklarasi dan inisialisasi array bertipe byte
        byte[] nilaiRatusan = {100, 101, 102, 103, 104};
        
        // Mengakses dan mencetak elemen-elemen array nilaiRatusan
        for (int i = 0; i < nilaiRatusan.length; i++) {
            System.out.println("Nilai Byte " + (i + 1) + ": " + nilaiRatusan[i]);
        }

        System.out.println("=========SHORT==========");
        // Deklarasi dan inisialisasi array bertipe short
        short[] nilaiShort = {32767, 31767, 24767, 15767, 26767};
        
        // Mengakses dan mencetak elemen-elemen array nilaiShort
        for (int i = 0; i < nilaiShort.length; i++) {
            System.out.println("Nilai Short " + (i + 1) + ": " + nilaiShort[i]);
        }

        System.out.println("=========LONG==========");
        // Deklarasi dan inisialisasi array bertipe long
        long[] nilaiLong = {123456789012345L};
        
        // Mengakses dan mencetak elemen-elemen array nilaiLong
        for (int i = 0; i < nilaiLong.length; i++) {
            System.out.println("Nilai Long " + (i + 1) + ": " + nilaiLong[i]);
        }

        System.out.println("=========DOUBLE==========");
        // Deklarasi dan inisialisasi array bertipe double
        double[] nilaiDouble = {1.1, 2.1, 3.1, 4.1, 5.1};
        
        // Mengakses dan mencetak elemen-elemen array nilaiDouble
        for (int i = 0; i < nilaiDouble.length; i++) {
            System.out.println("Nilai double " + (i + 1) + ": " + nilaiDouble[i]);
        }

        System.out.println("=========CHAR==========");
        // Deklarasi dan inisialisasi array bertipe char
        char[] nilaiChar = {'A', 'B', 'C', 'D', 'E'};
        
        // Mengakses dan mencetak elemen-elemen array nilaiChar
        for (int i = 0; i < nilaiChar.length; i++) {
            System.out.println("Nilai Char " + (i + 1) + ": " + nilaiChar[i]);
        }

        System.out.println("=========BOOLEAN==========");
        // Deklarasi dan inisialisasi array bertipe boolean
        boolean[] nilaiBoolean = {true, false, true, false};
        
        // Mengakses dan mencetak elemen-elemen array nilaiBoolean
        for (int i = 0; i < nilaiBoolean.length; i++) {
            System.out.println("Nilai Boolean " + (i + 1) + ": " + nilaiBoolean[i]);
        }
    }
}
