package de.kernpunkt.document.model;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class Benutzer {

    private int benutzerId;
    private String email;
    private String password;
    private String name;

    List<Document> documents = new ArrayList<Document>();

    public int getBenutzerId() {
        return benutzerId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setBenutzerId(int benutzerId) {
        this.benutzerId = benutzerId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
