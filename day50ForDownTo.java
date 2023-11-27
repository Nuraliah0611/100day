package day5;
import java.util.Scanner;
public class day50ForDownTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan batas bawah
        System.out.print("Masukkan batas bawah: ");
        int batasBawah = sc.nextInt();

        // Meminta pengguna untuk memasukkan batas atas
        System.out.print("Masukkan batas atas: ");
        int batasAtas = sc.nextInt();

        int jumlah = 0;

        // Menggunakan perulangan for mundur dari batasAtas ke batasBawah
        System.out.println("Menggunakan for mundur:");

        // Iterasi mundur dari batasAtas ke batasBawah
        for (int i = batasAtas; i >= batasBawah; i--) {
            System.out.println("Nilai i: " + i);
            
            // Menambahkan nilai i ke dalam jumlah
            jumlah += i;
        }

        // Menampilkan jumlah dari deret angka
        System.out.println("Jumlah: " + jumlah);

        // Menutup scanner untuk menghindari kebocoran memori
        sc.close();
    }
}
