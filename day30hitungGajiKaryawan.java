package day5;

public class day30hitungGajiKaryawan {
    public static void main(String[] args) {
        int jumlahHariKerja = 25;
        int gajiKotorPerHari = 1200000;
        int uangMakanPerHari = 15000;

        // Hitung gaji kotor dan total uang makan
        int gajiKotor = jumlahHariKerja * gajiKotorPerHari;
        int totalUangMakan = jumlahHariKerja * uangMakanPerHari;

        // Gaji bersih tanpa pengurangan
        int gajiBersih = gajiKotor - totalUangMakan ;

        // Tampilkan hasil
        System.out.println("==================================");
        System.out.println("Jumlah Hari Kerja: " + jumlahHariKerja + " hari");
        System.out.println("Gaji Kotor per Hari: Rp " + gajiKotorPerHari);
        System.out.println("Uang Makan per Hari: Rp " + uangMakanPerHari);
        System.out.println("Gaji Kotor: Rp " + gajiKotor);
        System.out.println("Total Uang Makan: Rp " + totalUangMakan);
        System.out.println("Gaji Bersih : Rp " + gajiBersih);
        System.out.println("==================================");
    }
}
