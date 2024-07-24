package com.onlinefoodsys.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoodsys.restapi.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
