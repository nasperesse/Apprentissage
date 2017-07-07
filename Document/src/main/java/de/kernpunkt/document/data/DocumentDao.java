package de.kernpunkt.document.data;

import java.util.List;
import de.kernpunkt.document.model.Document;

/**
 * Created by nmodjo on 03.07.2017.
 */
public interface DocumentDao {

    public List<Document> getAll();
}
