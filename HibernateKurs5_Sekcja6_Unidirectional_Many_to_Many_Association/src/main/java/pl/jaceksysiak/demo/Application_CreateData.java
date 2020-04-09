package pl.jaceksysiak.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;
import java.util.Date;

import pl.jaceksysiak.demo.entity.Account;
import pl.jaceksysiak.demo.entity.User;


public class Application_CreateData {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(User.class)
								.addAnnotatedClass(Account.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {	
			// start a transaction
			session.beginTransaction();
			
			//Creating the Object 
		
			//Saving the Object to DB
			
			 	
			// commit transaction
			session.getTransaction().commit();
		}
		finally {
			
			// add clean up code
			session.close();			
			factory.close();
		}
	}
	
	
	}