package com.supraja.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
