package com.HOSPITAL.CRMhospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HOSPITAL.CRMhospital.Dao.visitingDao;
import com.HOSPITAL.CRMhospital.entity.Visiting;
@Service
public class visitingService 
{
	@Autowired
	private visitingDao dao;
	
	
 public void savevisiting( Visiting visit)
 {
	 dao.save(visit);
 }
}
