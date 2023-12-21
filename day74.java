import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Validasi input
        while (n <= 0) {
            System.out.println("Masukkan nilai n harus lebih besar dari 0.");
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
        }

        // Menghitung jumlah bilangan ganjil dari 1 hingga n
        int jumlahGanjil = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                jumlahGanjil += i;
            }
        }

        // Menampilkan hasil
        System.out.println("\nJumlah bilangan ganjil dari 1 hingga " + n + " adalah: " + jumlahGanjil);

        // Menutup objek Scanner
        sc.close();
    }
}
