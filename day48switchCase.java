package day5;
import java.util.Scanner;
public class day48switchCase {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka hari (1-7): ");
        
        // Membaca input dari pengguna dan menyimpannya dalam variabel dayOfWeek
        int hari = sc.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Senin (Monday)");
                break;
            case 2:
                System.out.println("Selasa (Tuesday)");
                break;
            case 3:
                System.out.println("Rabu (Wednesday)");
                break;
            case 4:
                System.out.println(" Kamis (Thursday)");
                break;
            case 5:
                System.out.println("Jumat (Friday)");
                break;
            case 6:
                System.out.println(" Sabtu (Saturday)");
                break;
            case 7:
                System.out.println("Minggu (Sunday)");
                break;
            default:
                System.out.println("Tidak ada hari ke "+ hari);
        }
    }
}
