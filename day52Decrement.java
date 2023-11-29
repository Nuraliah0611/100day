package day5;
public class day52Decrement {
    public static void main(String[] args) {
        // Menggunakan operator decrement pada variabel
        int nilai = 10;

        System.out.println("Nilai awal: " + nilai);

        // Menggunakan operator decrement postfix (nilai--)
        nilai--;
        System.out.println("Setelah nilai-- (postfix): " + nilai);

        // Menggunakan operator decrement prefix (--nilai)
        --nilai;
        System.out.println("Setelah --nilai (prefix): " + nilai);

        // Menggunakan operator decrement dalam ekspresi
        int hasil = 3 * --nilai;
        System.out.println("Hasil ekspresi 3 * --nilai: " + hasil);
    }
}
