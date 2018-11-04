package com.HOSPITAL.CRMhospital.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Patients;
@Repository
public interface patientDao extends JpaRepository<Patients, Integer>
{
	@Query("select d.name,p.name from Medication m join m.medicine me join m.complaint c "
			+ "join c.disease d join c.visit v join v.doctor d "
			+ "join v.appoint a  "
			+ "join a.patient p where me.name = ?1")
  public List<Object[]>getPatientByMedicine(String medicineName);
  
  @Query("select p.name from Complaints c join c.visit v join c.disease d "
  		+ "join v.appoint a join a.patient p where d.name = ?1")
  public List<String>  getpatientnames(String patientName);
  
  @Query ("select d.name from Visiting v join v.doctor d "
  		+ "join v.appoint a join a.patient p where p.name = ?1    ")
  public List<Object>  getdoctornames(String patientName);
}
