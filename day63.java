
import java.util.Scanner;

public class day63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka positif: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Input tidak valid, masukkan angka positif");
        } else {
            long faktorial = HitungFaktorial(n);

            System.out.println("Faktorial dari " + n + " adalah " + faktorial);
        }
        sc.close();;
    }

    private static long HitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * HitungFaktorial(n - 1);
        }
    }

}
