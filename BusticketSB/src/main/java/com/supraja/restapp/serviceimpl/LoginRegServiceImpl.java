package com.supraja.restapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supraja.restapp.model.LoginReg;
import com.supraja.restapp.repository.LoginRegRepo;
import com.supraja.restapp.service.LoginRegService;

@Service
public class LoginRegServiceImpl implements LoginRegService
{
	@Autowired
	LoginRegRepo loginregRepo;

    @Override
    public LoginReg findByUsername(String username) {
        return loginregRepo.findByUsername(username);
    }

    @Override
    public LoginReg saveLoginReg(LoginReg loginreg) {
        loginreg.setPassword((loginreg.getPassword()));
        return loginregRepo.save(loginreg);
    }
}
