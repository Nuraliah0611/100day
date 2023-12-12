import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        int bilangan2;
        do {
            System.out.print("Masukkan bilangan kedua: ");
            bilangan2 = scanner.nextInt();

            // Memeriksa apakah bilangan kedua sama dengan 0
            if (bilangan2 == 0) {
                System.out.println("Input tidak valid. Bilangan kedua tidak boleh sama dengan 0.");
            }
        } while (bilangan2 == 0);

        // Menghitung dan menampilkan hasil pembagian
        double hasilPembagian = (double) bilangan1 / bilangan2;
        System.out.println("Hasil pembagian: " + hasilPembagian);

        // Menutup objek Scanner
        scanner.close();
    }
}
