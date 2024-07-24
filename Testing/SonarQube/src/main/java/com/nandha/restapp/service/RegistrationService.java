package com.nandha.restapp.service;

import java.util.List;
import com.nandha.restapp.model.Registration;

public interface RegistrationService {

	public Registration addRegistration(Registration rn);

	public Registration getRegistration(int id);

	public List<Registration> getAllRegistration();

	public Registration updateRegistration(Registration rn);

	public void deleteRegistrationById(int id);
}
