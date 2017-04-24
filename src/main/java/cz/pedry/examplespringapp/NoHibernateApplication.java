package cz.pedry.examplespringapp;

import cz.pedry.nohibernate.utils.NoHibernateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoHibernateApplication {

    public static void main(String[] args) {
        /*
         * Set classloader you want NoHibernate use to load classes
         * (usually it is the classloader of one of your classpath classes)
         */
        NoHibernateUtils.setClassLoader(NoHibernateApplication.class.getClassLoader());

        /*
         * Start Spring Boot application
         */
        SpringApplication.run(NoHibernateApplication.class, args);
    }

}
