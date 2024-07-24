package com.velan.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
