package com.tutorialpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorialpoint.domain.Student;
import com.tutorialpoint.exception.StudentException;

@Controller
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringMvc")Student student, ModelMap model) {
		if(student.getAge()<10){
			throw new StudentException("Age cannot be less then 10");
		}
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		return "result";
	}

}
