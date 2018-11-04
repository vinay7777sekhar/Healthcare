package com.HOSPITAL.CRMhospital.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HOSPITAL.CRMhospital.Dao.ComplaintDao;
import com.HOSPITAL.CRMhospital.entity.Complaints;
import com.HOSPITAL.CRMhospital.entity.Medication;
@Service
public class ComplaintService 
{
	@Autowired
	private ComplaintDao dao;
  public void savecomplaint(Complaints complaint)
  {
	  List<Medication> medicationlist  = complaint.getMedication();
	  for (Medication medication : medicationlist) 
	  {
		medication.setComplaint(complaint);
	}
	  dao.save(complaint);
  }
  public void saveallcomplaints(List<Complaints> complaint)
  {
	  for (Complaints complaints : complaint) 
	  {
		List<Medication> medicationlist = complaints.getMedication();
		for (Medication medication : medicationlist) 
		{
			medication.setComplaint(complaints);
		}
	}
	  dao.saveAll(complaint);
  }
  
 
}
