public class day43 {
    public static void main(String[] args) {
        
        // deklarasi array 
        String[] buah = {"semangka", "mangga", "pepaya", "kiwi"};

        // menggunakan loop for atau enhanced for untuk mencetak setiap elemen array
        System.out.println("======ARRAY SEBELUM DI UPDATE=====");
        for (String namaBuah : buah) {
            System.out.println(namaBuah +" ");

         }
        //mengubah(mengupdate) isi  dari index ke 2 dan 3

         buah[2] = "apel"; 
         buah[3] = "jambu"; 

         //menampilkan 

         System.out.println("=====SESUDAH DI UPDATE======");
         for (String namaBuah : buah){
            System.out.println(namaBuah +" ");
         }

    }
}
