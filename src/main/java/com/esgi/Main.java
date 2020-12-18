package com.esgi;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String login = "root";
        String pwd = "";
        try{
            Resource r = new ClassPathResource("applicationContext.xml");
            BeanFactory fac = new XmlBeanFactory(r);
            Coach patrick = (Coach) fac.getBean("Patrick");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection co = DriverManager.getConnection(url, login, pwd);
            Statement stmt = co.createStatement();
            //ResultSet res = stmt.executeQuery("select * from Cours");
            // the mysql insert statement
            String query = "INSERT INTO `coach`(`id`, `firstname`, `lastname`, `zipcode`) VALUES (null, ?, ?, ?) ";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = co.prepareStatement(query);
            preparedStmt.setString (1, patrick.getNom());
            preparedStmt.setString (2, patrick.getPrenom());
            preparedStmt.setInt (3, patrick.getCodepostal());
            preparedStmt.execute();

        }catch (Exception e){
            e.printStackTrace();
        }
//        Cours cours1 = new Cours(22, "java");
//
//        Resource r = new ClassPathResource("applicationContext.xml");
//        BeanFactory fac = new XmlBeanFactory(r);
//
//        Cours cours = (Cours) fac.getBean("Cours");
//        Coach patrick = (Coach) fac.getBean("Patrick");
//        Objectif objectif1 = (Objectif) fac.getBean("Objectif1");
//        Objectif objectif2 = (Objectif) fac.getBean("Objectif2");
//        Objectif objectif3 = (Objectif) fac.getBean("Objectif3");
//
//        patrick.addCours(cours);
//        objectif1.addObjectif(objectif2);
//
//        cours.afficher();

    }

}
