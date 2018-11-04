package com.HOSPITAL.CRMhospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Dao.DiseaseDao;
import com.HOSPITAL.CRMhospital.entity.Diseases;
@RestController
public class DiseaseController 
{
	@Autowired
	private DiseaseDao dao;
	
	@RequestMapping("saveDataDisease")
  public void saveDataDisease(@RequestBody Diseases di)
  {
	  dao.save(di);
  }
}
