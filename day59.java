package day5;

import java.util.ArrayList;
import java.util.List;

public class day59 {
    public static void main(String[] args) {
        List<String> namaList = new ArrayList<>();
        namaList.add("Nuraliah Ramadani");
        namaList.add("Nur Asyifa");
        namaList.add("Zul Kifli");
        
        System.out.println("daftar nama: ");
        for ( String namaa : namaList){
            System.out.println(namaa);
        }
        
        char CariKarakter = 'Z';
        System.out.println("\nNama nama yang mengandung karakter " + CariKarakter + ":");
        for ( String namaa : namaList){
            if (namaa.contains(String.valueOf(CariKarakter))) {
                System.out.println(namaa);
            }
        }
    }
}
