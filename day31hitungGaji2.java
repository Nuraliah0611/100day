package day5;

import java.util.Scanner;

public class day31hitungGaji2 {

    public static void main(String[] args) {
        int jumlah = 5;
        int uang = 0;
        for (int i = 0; i < jumlah; i++) {

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan hari kerja : ");
            int hariKerja = input.nextInt();
            int gajiKotorperhari = 120000;
            int uangMakan = 15000;
            int TotMakan = uangMakan * hariKerja;
            int gajiKotor = gajiKotorperhari * hariKerja;
            int gajiBersih = gajiKotor - TotMakan;
            uang += gajiBersih;

            System.out.println("============>Gaji Karyawan<============");

            System.out.println("Karyawan " + (i + 1));
            System.out.println("Jumlah Hari Kerja \t: " + hariKerja + " Hari");
            System.out.println("Uang Makan Perhari \t: Rp." + uangMakan);
            System.out.println("Gaji Kotor \t\t: Rp." + gajiKotor);
            System.out.println("Gaji Bersih \t\t: Rp." + gajiBersih);
            System.out.println("");

        }
        System.out.println("total uang yang disiapkan \t\t: Rp." + uang);
    }
}
