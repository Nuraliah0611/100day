import java.util.Scanner;

public class day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat dalam kilogram: ");
        double beratKg = scanner.nextDouble();

        double beratGram = konversiKgKeGram(beratKg);

        System.out.println("\nHasil konversi: " + beratKg + " kg = " + beratGram + " g");

        scanner.close();
    }

    private static double konversiKgKeGram(double beratKg) {
        return beratKg * 1000;
    }
}
