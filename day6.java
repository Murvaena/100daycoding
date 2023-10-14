public class day6{
    public static void main(String[] args) {


  
        boolean a = true;
        boolean b = false;
        boolean c ;
        boolean suka = true;
        String jawaban;
        int nilaiA ;
        int nilaiB ;
        boolean hasil;
        


        //operator logika 
        //and
        System.out.println("===========operator logika============");
        c= a && b;
        System.out.println("true && false = "+c);
        //or
        c = a || b;
        System.out.println(" true || false= "+c);
        //negasi/kebalikan
        System.out.println("negasi, !true= "+ !a);


        //operator ternary 
        System.out.println("=================operator ternary==========");
        jawaban = suka ? "iya" : "tidak";
        System.out.println(jawaban);


        //operator pembanding
        System.out.println("==========operator perbandingan===========");
        nilaiA= 5;
        nilaiB= 10;

        //apakah nilai A lebih besat dari B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        //apakah nilaiA lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        //apakah nilaiA lebih besar sama dengan  B?
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        //apakah nilaiA lebih kecil sama dengan  B?
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        //apakah nilaiA  sama dengan  B?
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        //apakah nilaiA tidak sama dengan  B?
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);






    }
}