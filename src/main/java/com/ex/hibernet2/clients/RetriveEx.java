package com.ex.hibernet2.clients;

import org.hibernate.Session;

import com.ex.hibernet2.entities.Emp;
import com.ex.hibernet2.utility.DBUtility;

public class RetriveEx {
public static void main(String[] args) {
	Session session = DBUtility.getSF().openSession();
	Emp e1  = session.get(Emp.class, 1);
	System.out.println(e1);
}
}
