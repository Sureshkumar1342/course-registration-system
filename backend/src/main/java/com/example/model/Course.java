package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseName;
	private String trainer;
	private int durationInMonths;
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public int getDurationInMonths() {
		return durationInMonths;
	}
	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

}
