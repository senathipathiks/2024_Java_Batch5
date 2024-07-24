package com.supraja.restapp.service;

import com.supraja.restapp.model.LoginReg;

public interface LoginRegService {

	LoginReg findByUsername(String username);

	LoginReg saveLoginReg(LoginReg loginreg);
}
