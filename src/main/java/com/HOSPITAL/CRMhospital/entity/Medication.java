package com.HOSPITAL.CRMhospital.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Medication 
{
 private Integer id;
 private String medicinename;
 private String howtouse;
 private Integer quantity;
 private Integer duration;
 private Medicine medicine;
 @ManyToOne
 @JoinColumn(name = "meid")
 public Medicine getMedicine() {
	return medicine;
}
public void setMedicine(Medicine medicine) {
	this.medicine = medicine;
}
private Complaints complaint;
@ManyToOne
@JoinColumn(name = "comid")
public Complaints getComplaint() {
	return complaint;
}
public void setComplaint(Complaints complaint) {
	this.complaint = complaint;
}
public String getHowtouse() {
	return howtouse;
}
public void setHowtouse(String howtouse) {
	this.howtouse = howtouse;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public Integer getDuration() {
	return duration;
}
public void setDuration(Integer duration) {
	this.duration = duration;
}

 @Id
 @GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getMedicinename() {
	return medicinename;
}
public void setMedicinename(String medicinename) {
	this.medicinename = medicinename;
}
 
}
