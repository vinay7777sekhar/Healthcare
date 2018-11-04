package com.HOSPITAL.CRMhospital.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Dao.patientDao;
import com.HOSPITAL.CRMhospital.entity.Patients;
@RestController
public class PatientController 
{
	@Autowired
	private patientDao dao;
	
	@RequestMapping("insertdata")
  public void insertdata(@RequestBody Patients pt)
  {
		
	    dao.save(pt);  
  }
	@RequestMapping("getPatientByMedicine/{name}")
	public List<Object[]> getPatientByMedicine(@PathVariable ("name")String medicineName)
	{
		return dao.getPatientByMedicine(medicineName);
	}
	
	@RequestMapping("getpatientnames/{name}")
	public List<String>  getpatientnames(@PathVariable ("name") String patientName)
	{
		return dao.getpatientnames(patientName);
	}
	
	@RequestMapping("getdoctornames/{name}")
	public List<Object>  getdoctornames(@PathVariable ("name") String patientName)
	{
		return dao.getdoctornames(patientName);
	}
}
