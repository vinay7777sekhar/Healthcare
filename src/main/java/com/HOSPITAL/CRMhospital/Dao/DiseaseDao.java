package com.HOSPITAL.CRMhospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Diseases;
@Repository
public interface DiseaseDao extends JpaRepository<Diseases, Integer>
{
  
}
