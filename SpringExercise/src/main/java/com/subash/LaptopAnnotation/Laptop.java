package com.subash.LaptopAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Laptop {
		@Value("1")
		int Lid;
		@Value("Hp")
		String Lname;
		
		@Autowired
		Specification specification;

		public Laptop() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Laptop(int lid, String lname, Specification specification) {
			super();
			Lid = lid;
			Lname = lname;
			specification = specification;
		}

		public int getLid() {
			return Lid;
		}

		public void setLid(int lid) {
			Lid = lid;
		}

		public String getLname() {
			return Lname;
		}

		public void setLname(String lname) {
			Lname = lname;
		}

		public Specification getSpecification() {
			return specification;
		}

		public void setSpecification(Specification specification) {
			specification = specification;
		}

		@Override
		public String toString() {
			return "Laptop [Lid=" + Lid + ", Lname=" + Lname + ", Specification=" + specification + "]";
		}
		
		public void display() {
			System.out.println(Lid);
			System.out.println(Lname);
			System.out.println(specification);
		}
		
		
}
