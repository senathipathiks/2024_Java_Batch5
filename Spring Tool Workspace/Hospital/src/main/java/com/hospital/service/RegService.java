package com.hospital.service;

import java.util.List;

import com.hospital.model.Register;

public interface RegService {
	public void addReg(Register reg);
	public List<Register> getAllReg();
	public void updateRegDetails(Register reg);
	public void deleteRegisterDetail(int id);
	public Register getReg(int id);
	public Register findUsername(String uname);
}
