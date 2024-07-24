package com.karthi.testing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.testing.model.Request;
import com.karthi.testing.serviceimpli.RequestServiceImpli;

@RestController
@RequestMapping("/request")
@CrossOrigin("http://localhost:3000")
public class ReqeustController {
	RequestServiceImpli requestServiceImpli;

	public ReqeustController(RequestServiceImpli requestServiceImpli) {
		this.requestServiceImpli = requestServiceImpli;
	}

	@PostMapping
	public void insertRequest(@RequestBody Request request) {
		requestServiceImpli.addOrUpdateRequest(request);
	}

	@PutMapping
	public void updateRequest(@RequestBody Request request) {
		requestServiceImpli.addOrUpdateRequest(request);
	}

	@GetMapping("/all")
	public List<Request> getRequests() {
		return requestServiceImpli.getAllRequest();
	}

	@DeleteMapping("{id}")
	public void deleteRequestData(@PathVariable("id") int id) {
		requestServiceImpli.deleteRequest(id);
	}

	@GetMapping("{id}/viewEmployeeRequests")
	public List<Request> getBloodRequests(@PathVariable("id") int id) {
		return requestServiceImpli.getAllRequestByBloodId(id);
	}
}
