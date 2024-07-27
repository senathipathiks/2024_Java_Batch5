package com.SpringBoot.Eg5.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg5.Model.Student;

@Repository
public interface Repo extends JpaRepository<Student, Integer>
{

}
