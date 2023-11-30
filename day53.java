public class day53{
    public static void main(String[] args) {
        //deklarasi array 3d
        int[][][] array3D ={
            {{1, 2, 3}},
            {{4, 5, 6}},
            {{7, 8, 9}}
        };
        //tampilkan
        for(int i = 0; i < array3D.length; i++){
            for(int j = 0; j < array3D[i].length; j++){
                for(int k = 0; k < array3D[i][j].length; k++){
                    System.out.print(array3D[i][j][k]+" ");

                }
                System.out.println();

            }
                System.out.println();
        }
    }
}