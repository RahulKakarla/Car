package com.kr.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class testHib {
	
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Jeep jeep=new Jeep("wrangler","Black",20000);
		session.save(jeep);
		tx.commit();
	}

}
