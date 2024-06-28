package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Books;

@Repository
public interface BookRepo extends JpaRepository<Books, Integer> {

}
