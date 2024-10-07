package com.spring.DAOFile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.entity.Student;

@Component
public class Insert {
	SessionFactory sf;

	@Autowired
	public Insert(@Qualifier("sf") SessionFactory sf) { // calling this  sf method from my APPconfig class. 
		super();
		this.sf = sf;
	}
	
	public void jee() {
		
	}
	
	public  void insertStudent(Student s) {
		try {
			Session session = sf.openSession();
			Transaction t = session.beginTransaction();
			session.persist(s);
			t.commit();
			session.close();
			System.out.println("success");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	

}
