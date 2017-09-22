package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class StudentEntity {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="CLASSECTIONID")
    private Integer classSectionID;
 
    @Column(name="NAME")
    private String name;
 
    @Column(name="ROLLNUMBER")  
    private Integer rollNumber;  
     
    @Column(name="DOB") 
    private String dateOfBirth;
    
    @Column(name="GENDER") 
    private String gender;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	public Integer getClassSectionID() {
		return classSectionID;
	}
	public void setClassSectionID(Integer classSectionID) {
		this.classSectionID = classSectionID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}