package com.madhan.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
