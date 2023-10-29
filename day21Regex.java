
package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day21Regex {
    public static void main(String[] args) {
        String text = "Program Studi Informatika, Fakultas Teknik; Universitas Sulawesi Barat";
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher(text);
        
        String text01 ="";
        while(m.find()){
            String c = m.group();
            if(c.equalsIgnoreCase("a")){
                text01 +="x";
            }else{
                text01 += c;
            }
        }
        System.out.println(text01);
    }
}
