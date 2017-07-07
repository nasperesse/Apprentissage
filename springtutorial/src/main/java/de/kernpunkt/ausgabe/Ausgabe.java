package de.kernpunkt.ausgabe;

import de.kernpunkt.test.Anschrift;
import de.kernpunkt.test.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by nmodjo on 03.07.2017.
 */

@Component("ausgabe")
public class Ausgabe {


    @Inject
    Anschrift anschrift;


    @Resource(name = "person")
    Person person;




    public void print(){

        System.out.println(anschrift.toString());

        System.out.println(person.toString());
    }
}
