package com.velan.BootCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velan.BootCRUD.bean.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
