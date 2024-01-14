import java.util.Scanner;

public class day98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = scanner.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String kataCari = scanner.next();

        int jumlahKemunculan = hitungKemunculan(teks, kataCari);

        System.out.println("Jumlah kemunculan kata \"" + kataCari + "\": " + jumlahKemunculan);
    }

    private static int hitungKemunculan(String teks, String kataCari) {
        int jumlah = 0;
        String[] kata = teks.split("\\s+");

        for (String kataTeks : kata) {
            if (kataTeks.equalsIgnoreCase(kataCari)) {
                jumlah++;
            }
        }

        return jumlah;
    }
}