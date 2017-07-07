package de.kernpunkt.document.springconfiguration;

import de.kernpunkt.document.model.Document;
import de.kernpunkt.document.model.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by nmodjo on 03.07.2017.
 */

@ComponentScan(basePackages = "de.kernpunkt.document.ausgabe")
@Configuration("springconfiguration")
public class SpringConfiguration {



  @Bean("document")
      public Document document(){

      Document doc =new Document();

          doc.setName("index");
          doc.setLocation("Public/index.html");
          doc.setType(type());
          doc.setCreated(new Date(15881581l));
          doc.setModified(new Date(74112151558l));


      return doc;

    }


    @Bean("type")
    public Type type(){

        Type typ = new Type();

        typ.setDesc("hypertex transfert text protocol");
        typ.setExtension(".html");
        typ.setName("HTML");


        return typ;
    }
}
