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
	public ModelAndView findRoom(@RequestParam int roomNo) {
		
		ModelAndView mv = new ModelAndView("home.jsp");
		
		HostelDirectory hostelDirectory = repoobj.findById(roomNo).orElse(new HostelDirectory());
		System.out.println(hostelDirectory.getsName());
		mv.addObject(hostelDirectory);
		return mv;
	}
}
