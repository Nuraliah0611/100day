import java.util.Scanner;

public class day93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan resolusi (piksel per unit): ");
        int resolusi = scanner.nextInt();

        double luas = hitungLuasPersegiPanjang(panjang, lebar);
        double keliling = hitungKelilingPersegiPanjang(panjang, lebar);

        int jumlahPiksel = hitungJumlahPiksel(panjang, lebar, resolusi);

        System.out.println("\nLuas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.println("Jumlah piksel: " + jumlahPiksel);

        scanner.close();
    }

    private static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    private static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    private static int hitungJumlahPiksel(double panjang, double lebar, int resolusi) {
        return (int) (panjang * resolusi) * (int) (lebar * resolusi);
    }
}
