import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat atau paragraf: ");
        String input = scanner.nextLine().toLowerCase();

        String[] kataArray = input.split("\\s+");

        Set<String> kataUnik = new HashSet<>();
        for (String kata : kataArray) {
            kataUnik.add(kata);
        }

        System.out.println("Jumlah kata unik: " + kataUnik.size());

        scanner.close();
    }
}
