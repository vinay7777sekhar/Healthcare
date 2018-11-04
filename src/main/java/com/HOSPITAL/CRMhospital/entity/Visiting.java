package com.HOSPITAL.CRMhospital.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Visiting
{
  private Integer id;
  private Date date;
  private Doctors doctor;
  @ManyToOne
  @JoinColumn(name = "did")
  public Doctors getDoctor() {
	return doctor;
}
public void setDoctor(Doctors doctor) {
	this.doctor = doctor;
}
private Appointment appoint;
  @OneToOne
  @JoinColumn(name = "appid")
  public Appointment getAppoint() {
	return appoint;
}
public void setAppoint(Appointment appoint) {
	this.appoint = appoint;
}
  @Id
  @GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
  
}
