package com.gopi.login;

import org.springframework.web.bind.annotation.RequestMapping;

public class Login {
	@RequestMapping("Login")
	public String messege() {
		return "Login";
	}
//	public class Reg {
//		@RequestMapping("reg")
//		public String messege() {
//			return "Reg";
//		}
//	}
}
