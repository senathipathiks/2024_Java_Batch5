package com.nandha.restapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nandha.restapp.model.Registration;
import com.nandha.restapp.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("http://localhost:3001,http://localhost:3000,http://localhost:3002,http://localhost:3003")
@RestController
@RequestMapping("/registration")
public class RegistrationController {

	RegistrationService service;

	public RegistrationController(RegistrationService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public Registration insertRegistration(@RequestBody Registration rn) {

		return service.addRegistration(rn);
	}

	@GetMapping("{id}")
	public Registration getRegistrationById(@PathVariable("id") int id) {
		return service.getRegistration(id);
	}

	@GetMapping("/all")
	public List<Registration> viewAllRegistration() {
		return service.getAllRegistration();
	}

	@PutMapping
	public Registration updateRegistration(@RequestBody Registration rn) {

		return service.updateRegistration(rn);
	}

	@DeleteMapping("{id}")
	public void deleteRegistrationById(@PathVariable("id") int id) {

		service.deleteRegistrationById(id);
	}
}
