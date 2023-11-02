
package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day25regexMencarikata {
    public static void main(String[] args) {
        String lia = " Nuraliah Ramadani anak pertama dari pasangan Sofyan D.S & Arfah Ahmad";
        
        //kata yang ingin dicari
        String kataDicari = "pertama";
        
        //membuat pola regex
        String regex = "\\b" + kataDicari +"\\b";
        
        //membuat object pattern
        Pattern pattern = Pattern.compile(regex);
        
        //mencocokkan teks dengan pola regex
        Matcher matcher = pattern.matcher(lia);
        
        //menemukan dan mencetak kata yang cocok
        while(matcher.find()){
            System.out.println("Kata Ditemukan :" +matcher.group());
        }
    }
}
