package com.coffee.repo;

import java.util.List;

import com.coffee.model.Orders;

public interface OrderRepo{

	public void save(Orders order);

	public Orders findById(int id);

	public void deleteById(int id);

	public List<Orders> findAll();

	public void update(Orders ord);

}
