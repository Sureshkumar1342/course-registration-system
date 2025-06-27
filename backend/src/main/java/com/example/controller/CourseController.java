package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.model.CourseRegistry;
import com.example.service.CourseService;

@RestController
@CrossOrigin(origins="http://localhost:5500")  
public class CourseController {
	
	@Autowired
	CourseService courseservice;

	@GetMapping("courses")
	public List<Course> availableCourses(){
		
		return courseservice.availablecourses();
	}
	
	@GetMapping("courses/enrolledstudents")
	public List<CourseRegistry> enrolledStudents(){
		return courseservice.enrolledStudents();
	}
	
	@PostMapping("courses/register")
	public String enrollCourse(@RequestParam("name") String name,
								@RequestParam("emailId") String emailId,
								@RequestParam("courseName") String courseName) {
		courseservice.enrollCourse(name,emailId,courseName);
		return "Congratulations "+name+" Enrollment Successful for "+courseName;
	}
}







