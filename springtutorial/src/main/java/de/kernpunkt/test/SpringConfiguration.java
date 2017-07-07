package de.kernpunkt.test;

import com.oracle.webservices.internal.api.message.PropertySet;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nmodjo on 03.07.2017.
 */
@ComponentScan(basePackages = "de.kernpunkt.ausgabe")
@Configuration
public class SpringConfiguration {

    @Value("Ange")
    private String vorname;


    @Bean(name = "person")
    public Person person(){

        Person a = new Person(2,"Ange");
        a.setVorname(vorname);
        a.setAnschrift(adress());
        return a;
        }



    @Bean(name = "adress")
    public Anschrift adress(){return new Anschrift("Maxstr",53122, "Köln");}
}
