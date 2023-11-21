package day5;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class day44ParsingWebDenganJSOUP {

    public static void main(String[] args) {
        day44ParsingWebDenganJSOUP doc;
        try {
            doc = Jsoup.connect("https://informatika.unsulbar.ac.id/").get();
            String title = doc.title();
            String text = doc.text();
            System.out.println("TITLE: " + title);
            System.out.println("TEXT: " + text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
