package com.SpringBoot.Eg8.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg8.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
