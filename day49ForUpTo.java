package day5;
import java.util.Scanner;
public class day49ForUpTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai awal dari pengguna
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = sc.nextInt();

        // Input nilai tertentu (batas atas) dari pengguna
        System.out.print("Masukkan nilai batas: ");
        int nilaiBatas = sc.nextInt();

        // Menggunakan perulangan for untuk iterasi dari nilai awal hingga nilai tertentu
        for (int i = nilaiAwal; i <= nilaiBatas; i++) {
            System.out.println("Nilai: " + i);
        }

        // Menutup scanner setelah digunakan
        sc.close();
    }
}
