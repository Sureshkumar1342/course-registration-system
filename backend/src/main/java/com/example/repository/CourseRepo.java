package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,String>{

}
