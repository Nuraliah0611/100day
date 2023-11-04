
package day5;

import java.util.HashMap;

public class day27HashMap {
    public static void main(String[] args) {
        //create a hash map object called ibuKotaNegara
        HashMap<String, String> ibuKotaNegara = new HashMap<String, String>();
        
        //tambahkan keys adn  values (Negara, Kota) menggunakan method put(key, value)
        ibuKotaNegara.put("England","London");
        ibuKotaNegara.put("Germany","Berlin");
        ibuKotaNegara.put("Norway","Oslo");
        ibuKotaNegara.put("USA","Washington DC");
        System.out.println(ibuKotaNegara);
        //pemanggilan menggunakan key "USA":
        System.out.println(ibuKotaNegara.get("USA"));
        
        int s = ibuKotaNegara.size();
        System.out.println("Banyaknya Ibu Kota Negara : " + s);
        
        //hapus key = England
        ibuKotaNegara.remove("England");
        System.out.println(ibuKotaNegara);
        
        //menampilkan semua key yang ada di hashmap
        System.out.println("Key Set :");
        for (String k : ibuKotaNegara.keySet()){
            System.out.println(k );
        }
        System.out.println();
        
        //menmapilkan semua value yang ada di hashmap
        System.out.println(" Values :");
        for ( String v : ibuKotaNegara.values()){
            System.out.println(v);
        }
        System.out.println();
        
        //menampilkan pasangan key dan value
        for (String k : ibuKotaNegara.keySet()){
            System.out.println("key : " + k + " value : " + ibuKotaNegara.get(k));
        }
        System.out.println();
        
        //clear
        ibuKotaNegara.clear();
        System.out.println(ibuKotaNegara);
    }
}


