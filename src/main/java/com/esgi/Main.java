package com.esgi;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {
        Cours cours1 = new Cours(22, "java");


        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory fac = new XmlBeanFactory(r);

        Cours cours = (Cours) fac.getBean("Cours");
        Coach patrick = (Coach) fac.getBean("Patrick");
        Objectif objectif1 =
        cours.afficher();


    }

}
