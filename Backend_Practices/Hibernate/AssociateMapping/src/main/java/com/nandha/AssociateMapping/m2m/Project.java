package com.nandha.AssociateMapping.m2m;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_mtom")
public class Project {

	@Id
	@Column(name = "projectId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	
	@Column(name = "ProjectName")
	private String projectName;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private List<Employee> empList;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName, List<Employee> empList) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.empList = empList;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", empList=" + empList + "]";
	}

	

}
