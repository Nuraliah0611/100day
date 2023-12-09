
import java.util.Scanner;

public class day62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahAngka = 0;
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;
        int total = 0;

        System.out.println("Masukkan angka (ketik 0 untuk mengakhiri): ");
        int input = sc.nextInt();

        while (input != 0) {
            nilaiTerbesar = Math.max(nilaiTerbesar, input);
            nilaiTerkecil = Math.min(nilaiTerkecil, input);

            total += input;
            jumlahAngka++;

            System.out.println("Masukkan angka (ketik 0 untuk mengakhiri): ");
            input = sc.nextInt();
        }

        double rataRata = (jumlahAngka > 0) ? (double) total / jumlahAngka : 0.0;

        System.out.println("Jumkah angka: " + jumlahAngka);
        System.out.println("Nilai Terbesar: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil: " + nilaiTerkecil);
        System.out.println("Rata rata: " + rataRata);

        sc.close();
    }
}
