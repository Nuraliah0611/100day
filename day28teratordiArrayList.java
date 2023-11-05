
package day5;

import java.util.ArrayList;
import java.util.Iterator;

public class day28teratordiArrayList {
    public static void main(String[] args) {
        ArrayList<String> namaKota = new ArrayList<String>();
        
        namaKota.add("Polewali Mandar");
        namaKota.add("Majene");
        namaKota.add("Mamuju");
        namaKota.add("Makassar");
        namaKota.add("Gowa");
        
        //iterator untuk meng-iterasi namaKota
        Iterator iterator = namaKota.iterator();
        
        System.out.println("Elemen elemen nama kota : ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
