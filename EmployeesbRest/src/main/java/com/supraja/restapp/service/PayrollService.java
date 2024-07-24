package com.supraja.restapp.service;

import java.util.List;


import com.supraja.restapp.model.Payroll;

public interface PayrollService 
{
  public void addPayroll(Payroll payroll);
  
  public Payroll getPayroll(int id);
  
  public List<Payroll> getAllPayroll();
  
  public void updatePayroll(Payroll payroll);
  
  public void deletePayroll(int id);
  
//  List<Integer> getAllId();
  
}
