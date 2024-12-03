package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MapDemo {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();

		// creating question
//		Question q = new Question();
//		q.setQuestionId(1212);
//		q.setQuestion("What is Java ?");
//
//		// creating Answer
//		Answer a = new Answer();
//		a.setAnswerId(343);
//		a.setAnswer("Java is Programming Langauge");
//		a.setQ(q);
//		
//		// creating Answer
//		Answer a2 = new Answer();
//		a2.setAnswerId(345);
//		a2.setAnswer("Java has different types of frameworks ");
//		a2.setQ(q);
//		
//		// creating Answer
//		Answer a1 = new Answer();
//		a1.setAnswerId(344);
//		a1.setAnswer("With the help of java we can create softwares ");
//		a1.setQ(q);
//				
//
//		List<Answer> list= new ArrayList<Answer>();
//		list.add(a);
//		list.add(a1);
//		list.add(a2);
//		
//		q.setAnswer(list);
//		
		Session s = factory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();

//		
//		s.save(q);
//		s.save(a);
//		s.save(a1);
//		s.save(a2);
//		s.save(list);
//		s.save(q);
		
//		
		Question q1=s.get(Question.class, 1212);
		
		System.out.println(q1.getQuestionId());
		System.out.println(q1.getQuestion());
		
//		lazy loading
//		System.out.println(q1.getAnswer().size());
		
//		Eager loading
		System.out.println(q1.getAnswer().size());
		
//		System.out.println(q.getQuestion());
//		
//		for(Answer a:q.getAnswer()){
//			System.out.println(a.getAnswer());
//		}
		tx.commit();
		
		
//		//fetching
//		Question ques=s.get(Question.class,1212);
//		System.out.println(ques.getQuestion());
//		System.out.println(ques.getAnswer().getAnswer());
		
		s.close();
		factory.close();

	}

}
