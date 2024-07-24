package com.velan.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

}

