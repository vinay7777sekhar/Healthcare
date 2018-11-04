package com.HOSPITAL.CRMhospital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Appointment 
{
  private Integer id;
  private String name;
  private Integer phone;
  private String email; 
private Patients patient;
  
  @ManyToOne
  @JoinColumn(name = "ptid")
  public Patients getPatient() {
	return patient;
}
public void setPatient(Patients patient) {
	this.patient = patient;
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
public Integer getPhone() {
	return phone;
}
public void setPhone(Integer phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
  
}
