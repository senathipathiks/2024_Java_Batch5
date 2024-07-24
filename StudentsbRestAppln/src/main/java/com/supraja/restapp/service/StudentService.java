package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Student;

public interface StudentService 
{
  public String addStudent(Student student);
  
  public Student getStudent(int id);
  
  public List<Student> getAllStudent();
  
  public String updateStudent(Student student);
  
  public String deleteStudent(int id);
  
}
