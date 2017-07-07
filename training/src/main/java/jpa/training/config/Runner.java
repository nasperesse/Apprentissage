package jpa.training.config;

import jpa.training.handlers.BooksHandler;
import jpa.training.models.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nmodjo on 07.07.2017.
 */
public class Runner {

    public static void main(String args[]){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ctx.scan("jpa.training");

        BooksHandler handler = (BooksHandler) ctx.getBean("test");


        //Buch erstellen
        Book book = handler.createBook("Test","123",2015);

          handler.createBook("Test 2","124", 1980);

          //Buch abrufen

        Book found = handler.getBook(1);

        System.out.println("Gefundenes Buch "+ found.getTitle());

        handler.remove(found);

        System.out.println("Book Löschen");
    }
}
