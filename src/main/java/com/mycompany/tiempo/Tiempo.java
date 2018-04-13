
package com.mycompany.tiempo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Tiempo {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();

    }
    
}
