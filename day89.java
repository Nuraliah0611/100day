
import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = sc.nextInt();

        while (bilangan < 0) {
            System.out.println("Input tidak valid. Masukkan bilangan bulat positif.");
            System.out.print("Masukkan bilangan bulat positif: ");
            bilangan = sc.nextInt();
        }

        long faktorial = hitungFaktorial(bilangan);

        System.out.println("\nFaktorial dari " + bilangan + " adalah: " + faktorial);

        sc.close();
    }

    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
