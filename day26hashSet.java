
package day5;

import java.util.HashSet;

public class day26hashSet {
    public static void main(String[] args) {
     
        HashSet<String> cars = new HashSet<String>();
        
        //keyword add digunakan untuk menambah data
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Corolla");
        cars.add("Pajero");
        cars.add("Fortuner");
        System.out.println(cars);
        
        //keyword contains digunakan untuk memeriksa apakah sebuah item sudah ada dihashset atau belum
        cars.contains("Pajero");
        System.out.println(cars);
        
        //keyword remove digunakan untuk mengahpus item pada hashset
        cars.remove("volvo");
        System.out.println(cars);
        
        //keyword clear digunakan untuk membersihkan/mengosongkan hashset
        cars.clear();
        System.out.println(cars);
        
    }  
}
