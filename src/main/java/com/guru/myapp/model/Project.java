/**
 * 
 */
package com.guru.myapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author bgurunath
 *
 */
@Entity
@Table(name="T_PROJECT")
public class Project {
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;

	@Column(name="PROJECT_NAME")
	private String projectName;
	
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "EMP_ID")
    @JsonIgnore
    private Employee employee;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
    
    
}
