package com.subash.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subash.api.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
