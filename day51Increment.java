package day5;
public class day51Increment {
    public static void main(String[] args) {
        // Menggunakan operator increment pada variabel
        int nilai = 5;

        System.out.println("Nilai awal: " + nilai);

        // Menggunakan operator increment postfix (nilai++)
        nilai++;
        System.out.println("Setelah nilai++ (postfix): " + nilai);

        // Menggunakan operator increment prefix (++nilai)
        ++nilai;
        System.out.println("Setelah ++nilai (prefix): " + nilai);

        // Menggunakan operator increment dalam ekspresi
        int hasil = 2 * ++nilai;
        System.out.println("Hasil ekspresi 2 * ++nilai: " + hasil);
    }
}
