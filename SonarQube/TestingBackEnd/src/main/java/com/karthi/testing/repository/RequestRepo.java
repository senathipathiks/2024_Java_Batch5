package com.karthi.testing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.karthi.testing.model.Request;

@Repository
public interface RequestRepo extends JpaRepository<Request, Integer> {
	@Query(value = "select * from request where bank_id = :id", nativeQuery = true)
	public List<Request> findByBloodId(int id);
}
