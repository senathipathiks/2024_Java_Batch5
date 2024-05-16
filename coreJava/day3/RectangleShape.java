package com.day3;

import java.util.*;

 class Rectangle {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 public double getArea() {
     return width * height;
 }

 public double getPerimeter() {
     return 2 * (width + height);
 }
}


public class RectangleShape {
 public static void main(String[] args) {
     double width, height;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the width of the rectangle: ");
     width = sc.nextDouble();

     System.out.println("Enter the height of the rectangle: ");
     height = sc.nextDouble();

     Rectangle rectangle = new Rectangle(width, height);

     System.out.println("Area: " + rectangle.getArea());
     System.out.println("Perimeter: " + rectangle.getPerimeter());
 }
}
