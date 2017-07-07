package de.kernpunkt.document.model; /**
 * Created by nmodjo on 03.07.2017.
 */

import java.util.Date;

public class Document {

    private int documentId;
    private String name;
    private Type type;
    private String location;
    private Date created;
    private Date modified;

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", location='" + location + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
