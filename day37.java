public class day37 {
    public static void main(String[] args) {

        //looping pada arraty

        //deklarasi array
        int [] a = {1, 2, 3, 4, 5};


        //menentukan jumlah pada index

        System.out.println("========JUMLAH INDEX=======");
        int jumlahIndex = a.length;
        System.out.println(jumlahIndex);

        //menampilkan semua index  
        System.out.println("=========MENAMPILKAN INDEX=====");
        for(int i = 0; i <= jumlahIndex; i++){
        System.out.print(a[i] + " ");

        }

        
        
    }
    
}
