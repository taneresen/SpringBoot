package com.onurciner.notalma;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onurciner.entity.Note;
import com.onurciner.service.NoteService;

@Controller
public class HomeController {
	
	@Autowired
	private NoteService NoteService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest reg) {

		System.out.println(reg.getRemoteAddr());
		model.addAttribute("mesaj", "Merhabalar");

		model.addAttribute("serverTime", "/");

		return "index";
	}

	@RequestMapping(value = "/detay", method = RequestMethod.GET)
	public String homeS(Model model)  {
		
		Note note = new Note();
		note.setTitle("Merhaba");
		note.setContent("Nasilsiniz");
		note.setUser_id(1l);
		
		NoteService.createNote(note);

		return "detail";

	}

	@RequestMapping(value = "/error_404", method = RequestMethod.GET)
	public String error(Model model) {

		return "error_404";
	}

}
