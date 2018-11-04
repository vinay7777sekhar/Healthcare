package com.HOSPITAL.CRMhospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Visiting;
@Repository
public interface visitingDao extends JpaRepository<Visiting, Integer>
{
  
}
