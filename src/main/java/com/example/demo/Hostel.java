package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.HostelRepo;

@Controller
public class Hostel {
	
	@Autowired
	HostelRepo repoobj;
	
	@RequestMapping("home")
	public String home() {
		return "form.jsp";		
	}
	
	@RequestMapping("addStudent")
	public String addStudent(HostelDirectory hobj) {
		repoobj.save(hobj);
		return "home.jsp";
	}
	
	@RequestMapping("findRoom")
	public String findRoom(@RequestParam String roomNo) {
		ModelAndView mv = new ModelAndView("findRoom");
		
		repoobj.findAllById(roomNo);
		return "home.jsp";
	}
}
