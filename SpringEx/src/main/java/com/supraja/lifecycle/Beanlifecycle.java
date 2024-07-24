package com.supraja.lifecycle;

public class Beanlifecycle 
{
  public Beanlifecycle()
  {
	  System.out.println("Constructor");
  }
  public void init()
  {
	  System.out.println("Init");
  }
  public void destroy()
  {
	  System.out.println("Destroy");
  }
}
