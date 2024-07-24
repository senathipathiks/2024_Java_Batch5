package com.nandha.Myapp.dao;

import org.springframework.stereotype.Repository;

import com.nandha.Myapp.bean.Login;
import com.nandha.Myapp.bean.Register;

@Repository
public class Dao {

	public int loginProcess(Login log) {

		int n = 0;

//	if(log.getName().equals("Nandha") && log.getPassword().equals("nandha123")){
		if (log.getName().equals("Nandha") && log.getPassword().equals("nandha123")) {

			n++;
		}

		return n;
	}

	public int registerProcess(Register reg) {

		int n = 0;

		if (reg.getName().trim().isEmpty() && reg.getEmail().trim().isEmpty() && reg.getPassword().trim().isEmpty()) {
			n++;
		}

		return n;
	}

}
