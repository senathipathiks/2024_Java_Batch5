package com.vickee.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vickee.restapp.model.Payroll;
import com.vickee.restapp.service.PayrollService;

@SpringBootTest
class PayrollServiceImplTest {

	
	@Autowired
	private PayrollService pay;
	
	
	@Test
	void testAddPayroll() {
		Payroll payroll = new Payroll(10000, 500, 500, 500, 500, 12000);
		assertEquals("success",pay.addPayroll(payroll));
	}
	
	@Test
	void testAddPayroll1() {
		Payroll payroll = new Payroll(20000, 500, 500, 500, 500, 22000);
		assertEquals("success",pay.addPayroll(payroll));
	}
	
	@Test
	void testAddPayroll2() {
		Payroll payroll = null;
		assertEquals("failure",pay.addPayroll(payroll));
	}
	
	@Test
	void testGetPayroll() {
		int id = 6;
		assertNotNull(pay.getPayroll(id));
	}
	
	@Test
	void testGetPayroll1() {
		int id = 7;
		assertNotNull(pay.getPayroll(id));
	}
	
	@Test
	void testGetAllPayrolls() {
		assertNotNull(pay.getAllPayrolls());
	}

	@Test
	void testUpdatePayroll() {
		Payroll payroll = new Payroll(12000, 34, 100, 100, 100, 12334);
		assertEquals("success", pay.updatePayroll(payroll));
	}

	@Test
	void testDeletePayroll() {
		int id = 24;
		assertEquals("success",pay.deletePayroll(id));
	}
}

