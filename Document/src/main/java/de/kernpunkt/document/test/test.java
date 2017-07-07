package de.kernpunkt.document.test;

import de.kernpunkt.document.ausgabe.Ausgabe;
import de.kernpunkt.document.model.Document;
import de.kernpunkt.document.springconfiguration.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import javafx.application.Application;

import javax.swing.*;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class test {

    public static void main(String[] args){

         //ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

      //  Document docu = (Document) context.getBean("docu");

       // System.out.println(docu);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        Ausgabe aus = (Ausgabe)context.getBean("ausgabe");

        aus.print();




    }
}
