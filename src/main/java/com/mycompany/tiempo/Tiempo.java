
package com.mycompany.tiempo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Tiempo {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
        
        String temperatura = "<span class=\"\">11<sup>°</sup></span>";
        Document extraer = Jsoup.parseBodyFragment(temperatura);
        Element body2 = doc.body();

        String estado = "<div class=\"today_nowcard-phrase\">Parcialmente nublado</div>";
        Document extraer2 = Jsoup.parseBodyFragment(estado);
        Element body = doc.body();
         
        Document mostrarParseado = Jsoup.parse(temperatura);
        System.out.println(doc.text());
        
        System.out.println(temperatura);
        System.out.println(estado);

    }
    
}
