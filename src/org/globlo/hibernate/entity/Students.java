package org.globlo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	@Id
	@Column(name ="students_Id")
	String studentsId;

	@Column(name ="students_name")
	String studentsName;

	@Column(name ="department")
	String department;

	@Column(name = "placed_companies")
	String placed_companies;
	
	public Students() {
		
	}

	public Students(String studentsId ,String studentsName, String department, String placed_companies) {
		super();
		this.studentsId = studentsId;
		this.studentsName = studentsName;
		this.department = department;
		this.placed_companies = placed_companies;
	}

	public String getStudentsId() {
		return studentsId;
	}

	public void setStudentsId(String studentsId) {
		this.studentsId = studentsId;
	}

	public String getStudentsName() {
		return studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPlaced_companies() {
		return placed_companies;
	}

	public void setPlaced_companies(String placed_companies) {
		this.placed_companies = placed_companies;
	}


}
