package org.wecancodeit.courseswithinstructors.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.courseswithinstructors.repository.CoursesRepository;
import org.wecancodeit.courseswithinstructors.repository.InstructorRepository;

@Controller
public class HogCon {
	
	@Resource
	CoursesRepository courseRepo;
	
	@Resource
	InstructorRepository instructorRepo;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:courses";
	}
	
	@RequestMapping("/courses")
	public String allCourses(Model model) {
		model.addAttribute("courses", courseRepo.findAll());
		return "courses";
	}
	
	@RequestMapping("/course/{id}")
	public String course(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("course", courseRepo.findById(id).get());
		return "course";
	}
	
	@RequestMapping("/instructor/{id}")
	public String instructor(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("instructor", instructorRepo.findById(id).get());
		return "instructor";
	}

}
