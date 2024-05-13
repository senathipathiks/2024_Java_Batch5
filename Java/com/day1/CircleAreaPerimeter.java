package com.day1;
import java.util.*;
import java.io.*;

public class CircleAreaPerimeter {
	public static void main(String args[]) {
		int r = Integer.parseInt(args[0]);
		System.out.println("Area of Circle: "+(Math.PI * r * r));
		System.out.println("Perimeter of Circle: "+(2 * Math.PI * r));
	}
}
