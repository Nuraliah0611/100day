
import java.util.Scanner;


public class day66 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai ujian dan nilai tugas
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();

        // Menghitung nilai akhir
        double nilaiAkhir = (0.6 * nilaiUjian) + (0.4 * nilaiTugas);

        // Menampilkan hasil
        System.out.println("Nilai akhir mahasiswa: " + nilaiAkhir);

        // Menutup objek Scanner
        sc.close();
    }
}

