package com.SpringBoot.Eg8.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg8.Model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>
{

}
