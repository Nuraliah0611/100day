
import java.util.Scanner;

public class day64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan1 = 0;
        int bilangan2 = 0;

        System.out.println("Masukkan bilangan pertama: ");
        bilangan1 = sc.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bilangan2 = sc.nextInt();

        int hasilPerkalian = bilangan1 * bilangan2;

        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        sc.close();

    }
}
