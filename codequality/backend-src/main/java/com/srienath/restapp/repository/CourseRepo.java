package com.srienath.restapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.srienath.restapp.model.Course;


public interface CourseRepo extends JpaRepository<Course, Integer> {

}
