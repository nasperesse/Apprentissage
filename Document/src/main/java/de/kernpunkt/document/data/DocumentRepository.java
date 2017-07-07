package de.kernpunkt.document.data;

import de.kernpunkt.document.model.Document;
import de.kernpunkt.document.model.Type;

import javax.print.Doc;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class DocumentRepository implements DocumentDao {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Document> getAll() {

        List<Document> result = new ArrayList<Document>();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        Document document = null;
        Type type = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from documents");
            while (resultSet.next()){
                document = new Document();
                document.setDocumentId(resultSet.getInt("documentId"));
                document.setLocation(resultSet.getString("location"));
                document.setModified(resultSet.getDate("modified");
                document.setCreated(resultSet.getDate("created"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
