package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Alumni;

public interface AlumniService {
	public String addAlumni(Alumni alumni);

	public Alumni getAlumni(int aid);

	public List<Alumni> getAllAlumni();

	public String updateAlumni(Alumni alumni);

	public String deleteAlumni(int aid);

}
