package org.globlo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import org.globlo.hibernate.entity.Students;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("C:\\Users\\karth\\eclipse-workspace\\students-details\\hibernate.cfg.xml")
                .addAnnotatedClass(Students.class)
                .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        
        try {
        	//create the object
        	Students students = new Students();
        	
        	//start transcation
        	session.beginTransaction();
        	
        	//perfom the operations
        	students = session.get(Students.class,"STD001");
        	
        	students.setStudentsName("test");
        	
        	//save the details
        	session.save(students);
        	
        	//commit the transcations
        	session.getTransaction().commit();
//        	System.out.println("Row added");
        	System.out.println(students);
        	
        }
        finally {
        	session.close();
        	factory.close();
        }
    }
}
