package com.prabha.restapp.repositoryImpl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Employee;
import com.prabha.restapp.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepoImpl implements EmployeeRepo {
		EntityManager eManager;
		public EmployeeRepoImpl(EntityManager eManager) {
			super();
			this.eManager = eManager;
		}

		public void save(Employee employee) {
			System.out.print(employee);
			eManager.persist(employee);
		}
		
		public List<Employee> findAll() {
			String hql = "from Employee";
			Query query = eManager.createQuery(hql);
			return query.getResultList();
		}
		
			public Employee findById(int id) {
				return eManager.find(Employee.class, id);
			}
			
			
			@Override
			public void update(Employee employee) {
				eManager.merge(employee);
			}
			
			@Override
			public void deleteById(int id) {
				Employee e = eManager.find(Employee.class, id);
				eManager.remove(e);
			}
	}
	 


