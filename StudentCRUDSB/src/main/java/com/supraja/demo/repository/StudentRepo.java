package com.supraja.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.supraja.demo.Bean.Student;



@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>
{
     @Query("select sid from Student")
     List<Integer> fetchIdList();
     
     @Query("select sname from Student")
     List<String> fetchNameList();
	
     @Transactional
     void deleteBySname(String sname);
}
