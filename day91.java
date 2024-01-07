import java.util.Scanner;

public class day91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        while (bilangan <= 0) {
            System.out.println("Input tidak valid. Masukkan bilangan bulat positif.");
            System.out.print("Masukkan bilangan bulat positif: ");
            bilangan = scanner.nextInt();
        }

        int jumlahDigitGenap = 0;
        int jumlahDigitGanjil = 0;

        while (bilangan > 0) {
            int digit = bilangan % 10;
            if (digit % 2 == 0) {
                jumlahDigitGenap++;
            } else {
                jumlahDigitGanjil++;
            }
            bilangan /= 10;
        }

        System.out.println("\nJumlah digit genap: " + jumlahDigitGenap);
        System.out.println("Jumlah digit ganjil: " + jumlahDigitGanjil);

        scanner.close();
    }
}
