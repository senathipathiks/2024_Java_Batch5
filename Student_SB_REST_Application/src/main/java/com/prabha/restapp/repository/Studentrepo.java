package com.prabha.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer>  {

}
