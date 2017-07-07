package de.kernpunkt.document.ausgabe;

import de.kernpunkt.document.model.Document;
import de.kernpunkt.document.model.Type;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by nmodjo on 03.07.2017.
 */

@Component("ausgabe")
public class Ausgabe {


    @Resource(name = "document")
    Document document;

    @Inject
    Type type;


    public void print(){

        System.out.println(document.toString());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Dannach");
        System.out.println(type.toString());
    }
}
