package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;
import com.example.model.CourseRegistry;
import com.example.repository.CourseRegistryRepo;
import com.example.repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courserepo;
	

	public List<Course> availablecourses() {
		return courserepo.findAll();
	}
	
	@Autowired
	CourseRegistryRepo courseregistryrepo;

	public List<CourseRegistry> enrolledStudents() {
		return courseregistryrepo.findAll();
	}

	public void enrollCourse(String name, String emailId, String courseName) {
		CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
		courseregistryrepo.save(courseRegistry);
	}

}
