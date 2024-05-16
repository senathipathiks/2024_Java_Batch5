package com.day3;


 class Person {
 private String name;
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}

//Main.java
public class MainPerson {
 public static void main(String[] args) {
     Person person1 = new Person("vidhu", 11);
     Person person2 = new Person("ani", 12);

     System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
     System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
 }
}

