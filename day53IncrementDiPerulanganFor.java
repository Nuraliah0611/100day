package day5;
public class day53IncrementDiPerulanganFor {
    public static void main(String[] args) {
        // Menggunakan operator increment dalam perulangan for
        System.out.println("Menggunakan increment dalam perulangan for:");

        // Increment nilai i dalam setiap iterasi
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nilai i: " + i);
        }

        // Contoh lain dengan increment yang berbeda
        System.out.println("\nMenggunakan increment yang berbeda dalam perulangan for:");

        // Increment nilai j dengan kelipatan 2 dalam setiap iterasi
        for (int j = 0; j <= 10; j += 2) {
            System.out.println("Nilai j: " + j);
        }
    }
}
