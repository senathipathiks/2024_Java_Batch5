package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Calc {
private int Num1;
private int Num2;
public Calc() {
	super();
	// TODO Auto-generated constructor stub
}
public Calc(int num1, int num2) {
	super();
	Num1 = num1;
	Num2 = num2;
}
public int getNum1() {
	return Num1;
}
public void setNum1(int num1) {
	Num1 = num1;
}
public int getNum2() {
	return Num2;
}
public void setNum2(int num2) {
	Num2 = num2;
}
@Override
public String toString() {
	return "Calc [Num1=" + Num1 + ", Num2=" + Num2 + "]";
}
 
 
}
 