package com.ex.hibernet2.clients;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ex.hibernet2.entities.Emp;
import com.ex.hibernet2.utility.DBUtility;

public class UpdateEx {
public static void main(String[] args) {
	SessionFactory sf = DBUtility.getSF();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	 Emp e = new Emp ();
	 e.setId(6);
	 e.setName("Ramana");
	 e.setSal(1668994);
	 session.save(e);
	 tx.commit();
	 
	 
	
}
}
