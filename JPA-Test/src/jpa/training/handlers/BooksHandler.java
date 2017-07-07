package jpa.training.handlers;

import jpa.training.models.Book;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by nmodjo on 07.07.2017.
 */

@Component("test")
@Transactional  //Automatische Transaction Steuerung
public class BooksHandler {

    @PersistenceContext
    private EntityManager em;

    public Book createBook(String title, String isbn, int year){

        Book book = new Book();

        book.setTitle(title);
        book.setIsbn(isbn);
        book.setYear(year);

        em.persist(book);
        System.out.println("ID ==>"+book.getId());

        return book;
    }


    public Book getBook(int id){

        //Sucht ein Buch
        return em.find(Book.class,id);
    }
}
