package com.assessment.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assessment.App.model.Order;
import com.assessment.App.service.OrderService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAllOrders() {
		return orderService.getAllOrders();
       
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public void addOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @PutMapping("/{id}")
    public void updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") int id) {
        orderService.deleteOrder(id);
    }
}

