package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.ShopKeeper;

@Repository
public interface ShopKeeperRepo extends JpaRepository<ShopKeeper, Integer> {

}