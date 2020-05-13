package com.onurciner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onurciner.dao.NoteDAO;
import com.onurciner.entity.Note;

@Service
@Transactional // Bazi veri tabanlari burda yönetsin diye belirtiyoruz.
public class NoteService {
	
	@Autowired
	private NoteDAO noteDAO;
	
	public long createNote (Note note) {
		return noteDAO.insert(note);
	}
	
	
	
	
}
