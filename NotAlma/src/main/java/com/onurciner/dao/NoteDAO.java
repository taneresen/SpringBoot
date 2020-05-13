package com.onurciner.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onurciner.entity.Note;

@Repository
public class NoteDAO {
	
	@Autowired // servlet-contexle baglanti kurulmasi icin.Injecte kullanilir.
	private SessionFactory sessionFactory; // org.hibernate improve edilir
	
	
	//CRUD (objemizi veritabanina ekleme anlaminda dusunelim)
	
	public Long insert(Note note) {
		
		return (Long) sessionFactory.getCurrentSession().save(note);
	}
	
	public void update(Note note) {
		
		sessionFactory.getCurrentSession().update(note);
	}
	
	public void persist(Note note) {
		
		sessionFactory.getCurrentSession().persist(note);
	}
	
	public void delete(Note note) {
		
		sessionFactory.getCurrentSession().delete(note);
	}
	
	
	//Read
	public ArrayList<Note> getAll(){
		Query query = sessionFactory.getCurrentSession().createQuery("From Note");
		return (ArrayList<Note>) query.getResultList();
		
		
	}
	

}
