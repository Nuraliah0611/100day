package day5;

import java.util.Calendar;
import java.util.Scanner;

public class day45HitungUmur {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna memasukkan tahun kelahiran
        System.out.print("Masukkan tahun kelahiran Anda: ");
        int tahunKelahiran = sc.nextInt();

        // Mendapatkan tahun sekarang
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);

        // Menghitung umur
        int umur = tahunSekarang - tahunKelahiran;

        // Menampilkan hasil
        System.out.println("Umur Anda adalah: " + umur + " tahun");

        // Menutup objek Scanner
        sc.close();
    }
}
