package com.day3;

import java.time.LocalDate;
import java.time.Period;

 class Employee{
 private String name;
 private String jobTitle;
 private double salary;
 private LocalDate hireDate;

 public Employee(String name, String jobTitle, double salary, LocalDate hireDate) {
     this.name = name; 
     this.jobTitle = jobTitle;
     this.salary = salary;
     this.hireDate = hireDate;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getJobTitle() {
     return jobTitle;
 }

 public void setJobTitle(String jobTitle) {
     this.jobTitle = jobTitle;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 public void raiseSalary(double percentage) {
     salary += salary * percentage / 100;
 }

 public int calculateYearsOfService() {
     LocalDate currentDate = LocalDate.now();
     Period servicePeriod = Period.between(hireDate, currentDate);
     return servicePeriod.getYears();
 }

 public void printEmployeeDetails() {
     System.out.println("Name: " + name);
     System.out.println("Job Title: " + jobTitle);
     System.out.println("Salary: $" + salary);
     System.out.println("Years of Service: " + calculateYearsOfService() + " years");
 }

 public static void EmployeeEx(String[] args) {
     LocalDate hireDate1 = LocalDate.of(2018, 5, 15);
     LocalDate hireDate2 = LocalDate.of(2019, 9, 10);

     Employee employee1 = new Employee("Alice Johnson", "Software Engineer", 75000, hireDate1);
     Employee employee2 = new Employee("Bob Smith", "Product Manager", 90000, hireDate2);

     System.out.println("Employee Details:");
     employee1.printEmployeeDetails();
     employee2.printEmployeeDetails();

     employee1.raiseSalary(10);
     employee2.raiseSalary(8);

     System.out.println("\nAfter raising salary:");
     employee1.printEmployeeDetails();
     employee2.printEmployeeDetails();
 }
}

