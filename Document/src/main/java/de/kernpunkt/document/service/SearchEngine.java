package de.kernpunkt.document.service;

import de.kernpunkt.document.model.Document;
import de.kernpunkt.document.model.Type;

import java.util.List;

/**
 * Created by nmodjo on 03.07.2017.
 */
public interface SearchEngine {

    List<Document> findbyType(Type documentType);

    List<Document> listAll();



}
