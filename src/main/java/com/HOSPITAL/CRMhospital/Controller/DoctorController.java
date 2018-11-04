package com.HOSPITAL.CRMhospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Dao.DoctorDao;
import com.HOSPITAL.CRMhospital.entity.Doctors;
@RestController
public class DoctorController 
{
	@Autowired
	private DoctorDao dao;
	@RequestMapping("savedatadoctor")
  public void savedatadoctor(@RequestBody Doctors dt)
  {
	  dao.save(dt);
  }
}
