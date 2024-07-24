package com.nandha.restapp.serviceimplementatiopn;

import java.util.List;
import org.springframework.stereotype.Service;
import com.nandha.restapp.model.Registration;
import com.nandha.restapp.repository.RegistrationRepo;
import com.nandha.restapp.service.RegistrationService;

@Service
public class RegistrationServiceImplementation implements RegistrationService {

	RegistrationRepo repo;

	public RegistrationServiceImplementation(RegistrationRepo repo) {
		super();
		this.repo = repo;
	}

	public Registration addRegistration(Registration rn) {
		return repo.save(rn);
	}

	@Override
	public Registration getRegistration(int id) {
		return repo.findById(id).orElse(null);
	}

	public List<Registration> getAllRegistration() {
		return repo.findAll();
	}

	public Registration updateRegistration(Registration rn) {
		return repo.save(rn);
	}

	public void deleteRegistrationById(int id) {
		repo.deleteById(id);	
	}
}
