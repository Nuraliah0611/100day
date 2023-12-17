import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang, lebar, dan tinggi balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = sc.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = sc.nextDouble();

        // Menghitung volume dan luas permukaan balok
        double volume = panjang * lebar * tinggi;
        double luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

        // Menampilkan hasil
        System.out.println("\nVolume balok: " + volume);
        System.out.println("Luas permukaan balok: " + luasPermukaan);

        // Menutup objek Scanner
        sc.close();
    }
}
