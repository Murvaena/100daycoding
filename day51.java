public class day51 {

   
    public static void main(String[] args) {
        String teks = "Ini adalah contoh kalimat untuk contoh n-gram";
        int n = 2; // Ganti nilai ini untuk n-gram yang berbeda

        String[] kata = teks.split("\\s+");

        for (int i = 0; i <= kata.length - n; i++) {
            StringBuilder ngram = new StringBuilder();
            for (int j = i; j < i + n; j++) {
                ngram.append(kata[j]).append(" ");
            }
            System.out.println(ngram.toString().trim());
        }
    }
}
}
