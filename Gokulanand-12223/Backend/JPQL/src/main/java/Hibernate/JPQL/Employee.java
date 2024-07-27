package Hibernate.JPQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


	@Entity
	@Table(name = "emp")
	
	@NamedQueries(value = {
		@NamedQuery( query = "select e from Employee e where e.id = ?1", name = "findById")})
	
	
	
	public class Employee 
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		int id;
		@Column
		String name;
		@Column
		String salary;
		public Employee() 
		{
			super();
		}

		public Employee(int id, String name, String salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}	
	}

