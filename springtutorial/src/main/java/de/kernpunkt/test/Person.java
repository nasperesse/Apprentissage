package de.kernpunkt.test;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class Person {

    private int id;
    private String name;
    private String vorname;

    private Anschrift anschrift;

    public Person(){}
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public void setAnschrift(Anschrift anschrift){
        this.anschrift = anschrift;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", anschrift=" + anschrift +
                '}';
    }

    public void speak(){

        System.out.println("Hello ich bin eine Person");
    }
}
