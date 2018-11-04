package com.HOSPITAL.CRMhospital.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Patients 
{
  private Integer id;
  private String name;
  private Integer age;
  private String gender; 
  private Date date;
  
  public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Id
  @GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
  
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}
