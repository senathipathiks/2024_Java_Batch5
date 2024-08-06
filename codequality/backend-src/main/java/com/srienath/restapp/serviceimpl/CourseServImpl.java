package com.srienath.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.srienath.restapp.model.Course;
import com.srienath.restapp.repository.CourseRepo;
import com.srienath.restapp.service.CourseServ;

@Service
public class CourseServImpl implements CourseServ{

	CourseRepo repo;
	
	public CourseServImpl(CourseRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addCourse(Course cs) {
		repo.save(cs);
		return "Insert Success";
	}

	@Override
	public List<Course> listAllCourses() {
		return repo.findAll();
	}

	@Override
	public Course getCourseById(int id) {
		Optional<Course> course = repo.findById(id);
		if(course.isPresent()) {
			return course.get();
		} else {
			return null;
		}
	}

	@Override
	public String updateCourse(Course cs) {
		repo.save(cs);
		return "Update Success";
	}

	@Override
	public String deleteCourse(int id) {
		repo.deleteById(id);
		return "Deletion Success";
	}

	
}

