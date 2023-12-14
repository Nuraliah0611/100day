import java.util.Scanner;

public class day67 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua kata
        System.out.print("Masukkan kata pertama: ");
        String kata1 = sc.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = sc.nextLine();

        // Melakukan penggabungan kata
        String hasil = kata1 + " " + kata2;
        System.out.println("\nHasil gabung: " + hasil);

        // Menutup objek Scanner
        sc.close();
    }
}
