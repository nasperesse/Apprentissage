package de.kernpunkt.test;

import de.kernpunkt.ausgabe.Ausgabe;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class App {

    public static void main(String[] args){


       // ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Ausgabe ange = (Ausgabe)context.getBean("ausgabe");

       // Anschrift anschrift = (Anschrift) context.getBean("adress");

        ange.print();

       // System.out.println(anschrift);

        //System.out.println(ange);


       // ((FileSystemXmlApplicationContext)context).close();


    }
}
