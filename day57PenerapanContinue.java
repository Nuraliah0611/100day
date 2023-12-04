package day5;
public class day57PenerapanContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // lanjutkan iterasi jika i adalah bilangan genap
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Nilai i: " + i);
        }
        int j = 0;
        while ( j < 10){
            j++;
            //lanjutkan iterasi jika j adalah bilangan ganjil
            if (j % 2 != 0) {
                continue;
            }
            System.out.println("Nilai J: " + j);
        }
    }
}
