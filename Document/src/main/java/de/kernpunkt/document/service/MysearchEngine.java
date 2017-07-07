package de.kernpunkt.document.service;

import de.kernpunkt.document.model.Document;
import de.kernpunkt.document.model.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class MysearchEngine implements SearchEngine {
    public List<Document> findbyType(Type documentType) {

        List<Document> result = new ArrayList<Document>();

        for(Document docu: storage()){

            result.add(docu);
        }

        return result;
    }

    public List<Document> listAll() {
        return storage();
    }

    private List<Document> storage(){

        List<Document> result = new ArrayList<Document>();

        Type type = new Type();
        type.setName("PDF");
        type.setExtension(".pdf");
        type.setDesc("Portable Document Format");

        Document document = new Document();
        document.setName("Book Template");
        document.setType(type);
        document.setLocation("/Document/Book Template.pdf");

        result.add(document);

        return result;
    }
}
