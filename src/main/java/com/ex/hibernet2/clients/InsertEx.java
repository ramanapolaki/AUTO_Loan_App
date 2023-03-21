package com.ex.hibernet2.clients;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ex.hibernet2.entities.Address;
import com.ex.hibernet2.entities.Emp;
import com.ex.hibernet2.utility.DBUtility;

public class InsertEx {
 public static void main(String[] args) {
	Session session = DBUtility.getSF().openSession();
	Transaction tx = session.beginTransaction();
	

	Address add =  new Address();
	add.setCity ("Hyd");
	add.setCode(5000240);
	
	Emp e1 = new Emp();
	e1.setName("Ram");
	e1.setSal(100000);
	e1.setAddress(add);
	 
	session.save(e1);
	tx.commit();
	
}
}
