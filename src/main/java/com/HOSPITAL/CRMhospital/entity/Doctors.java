package com.HOSPITAL.CRMhospital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Doctors 
{
  private Integer did;
  private String name;
  private String specialization;
  private boolean available;
 
  @Id
  @GeneratedValue
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}
  
}
