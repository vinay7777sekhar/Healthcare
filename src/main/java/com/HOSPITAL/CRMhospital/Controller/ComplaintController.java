package com.HOSPITAL.CRMhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Service.ComplaintService;
import com.HOSPITAL.CRMhospital.entity.Complaints;
@RestController
@RequestMapping("complaints")
public class ComplaintController 
{
	@Autowired
	private ComplaintService ser;
	
	@PostMapping
 public void savecomplaints(@RequestBody Complaints complaint)
 {
	 ser.savecomplaint(complaint);
 }
	@PostMapping("/all")
	public void saveallcomplaints(@RequestBody List<Complaints> complaint)
	{
		ser.saveallcomplaints(complaint);
	}
}
