
import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama depan dan nama belakang
        System.out.print("Masukkan nama depan: ");
        String namaDepan = sc.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = sc.nextLine();

        // Melakukan penggabungan nama dan menghitung panjangnya
        String namaLengkap = namaDepan + " " + namaBelakang;
        int panjangNamaDepan = namaDepan.length();
        int panjangNamaBelakang = namaBelakang.length();

        // Menampilkan hasil
        System.out.println("\nNama lengkap: " + namaLengkap);
        System.out.println("Panjang nama depan: " + panjangNamaDepan);
        System.out.println("Panjang nama belakang: " + panjangNamaBelakang);

        // Menutup objek Scanner
        sc.close();
    }
}

