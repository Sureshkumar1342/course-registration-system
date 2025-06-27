package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.CourseRegistry;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {

}
