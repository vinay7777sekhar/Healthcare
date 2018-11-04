package com.HOSPITAL.CRMhospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Service.visitingService;
import com.HOSPITAL.CRMhospital.entity.Visiting;
@RestController
@RequestMapping("visiting")
public class visitingController 
{
	@Autowired
	private visitingService ser;
	@PostMapping
  public void savevisiting(@RequestBody Visiting visit)
  {
	  ser.savevisiting(visit);
  }
}
