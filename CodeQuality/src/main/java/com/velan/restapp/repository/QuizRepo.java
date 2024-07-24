package com.velan.restapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.velan.restapp.model.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {
	@Query("select tid from Quiz")
	public List<Integer> getIdList();
}
