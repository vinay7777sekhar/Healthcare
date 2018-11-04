package com.HOSPITAL.CRMhospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HOSPITAL.CRMhospital.Dao.MedicineDao;
import com.HOSPITAL.CRMhospital.entity.Medicine;
@RestController
public class MedicianController
{
	@Autowired
	private MedicineDao dao;
	
	@RequestMapping("savedatamedicine")
  public void savedatamedicine(@RequestBody Medicine med)
  {
	  dao.save(med);
  }
}
