package com.HOSPITAL.CRMhospital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Complaints 
{
  private Integer id;
  private String description;
  private List<Diseases> disease;
  private Visiting visit;
  
private List<Medication> medication;
@OneToMany(mappedBy = "complaint",cascade = CascadeType.ALL)
  public List<Medication> getMedication() {
	return medication;
}
public void setMedication(List<Medication> medication) {
	this.medication = medication;
}
@Id
  @GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@ManyToMany
@JoinTable(name="complaint_disease",joinColumns={@JoinColumn(name="cid")},
              inverseJoinColumns={@JoinColumn(name="deid")})
public List<Diseases> getDisease() {
	return disease;
}
public void setDisease(List<Diseases> disease) {
	this.disease = disease;
}

@ManyToOne
@JoinColumn(name = "vistid")
public Visiting getVisit() {
	return visit;
}
public void setVisit(Visiting visit) {
	this.visit = visit;
}


}
