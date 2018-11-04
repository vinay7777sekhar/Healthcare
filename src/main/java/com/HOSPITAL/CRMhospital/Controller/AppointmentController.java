package com.HOSPITAL.CRMhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Dao.AppointmentDao;
import com.HOSPITAL.CRMhospital.entity.Appointment;
@RestController
@RequestMapping("appointment")
public class AppointmentController
{
	@Autowired
	private AppointmentDao dao;
	
	@PostMapping
  public void savecontroller(@RequestBody Appointment ap)
  {
	  dao.save(ap);
  }
	@PostMapping("/all")
	public void savecontroller(@RequestBody List<Appointment> app)
	{
		dao.saveAll(app);
	}
}
