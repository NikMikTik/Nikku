package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.Itemm;



public class Admin {
	
	
	public void Show()
		{
		Session session1=HibernateUtil.getSessionFactory().openSession();
		Query query=session1.createQuery("from Itemm");
		List<Itemm> itm=query.list();
		for(Itemm em:itm)
		{System.out.println(em);}
		session1.close();
		}
	
	public void Add()
	{Itemm item1=new Itemm();
	item1.setIname("Laptop");
	item1.setPrice(6000.90f);
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction tx=session.beginTransaction();	
	session.save(item1);
	tx.commit();
	System.out.println("Emp Added");
	session.close();}
	
	public void Update()
	{Session session3=HibernateUtil.getSessionFactory().openSession();
	Transaction tx1=session3.beginTransaction();
	tx1.begin();
	Itemm mm=new Itemm();
	mm=(Itemm)session3.get(Itemm.class, 2);
	mm.setPrice(8000.89f);
	tx1.commit();
	session3.close();
	System.out.println("Updated");}
	
	public void Search()
	{Session session4=HibernateUtil.getSessionFactory().openSession();
	Itemm iti=new Itemm();
	iti=(Itemm)session4.get(Itemm.class, 2);
	System.out.println(iti);}
	
	public void Del()
	{Session session5=HibernateUtil.getSessionFactory().openSession();
	Transaction tx2=session5.beginTransaction();
	Itemm itt=new Itemm();
	itt=(Itemm)session5.get(Itemm.class, 5);
	session5.delete(itt);
	tx2.commit();session5.close();
	System.out.println("Deleted");}
		
	

	

}
