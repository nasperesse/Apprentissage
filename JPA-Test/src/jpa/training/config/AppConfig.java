package jpa.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationAdvisor;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.Map;
import java.util.Properties;

/**
 * Created by nmodjo on 07.07.2017.
 */

@Configuration
@ComponentScan(basePackages = "jpa.training.handlers")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean getEntityManagerFactory() {

    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();

    emf.setDataSource(getDataSource());
    emf.setPackagesToScan("jpa.training.models");

    JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

    emf.setJpaVendorAdapter(adapter);
    emf.setJpaProperties(getProperties());

    return emf;

}


    @Bean
    public DataSource getDataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3311/books");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }


    private Properties getProperties(){

        Properties props = new Properties();

        props.setProperty("hibernate.hbm2ddl.auto","create");
        props.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        props.setProperty("hibernate.show_sql","true");

        return props;
    }

    @Bean
    public PlatformTransactionManager getTransactionManager(EntityManagerFactory emf){

        JpaTransactionManager manager = new JpaTransactionManager();

        manager.setEntityManagerFactory(emf);

        return manager;

    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor getPostProcessor(){

        return new PersistenceExceptionTranslationPostProcessor();
    }
}
