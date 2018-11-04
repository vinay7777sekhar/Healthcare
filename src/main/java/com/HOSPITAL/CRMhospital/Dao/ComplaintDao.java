package com.HOSPITAL.CRMhospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Complaints;
@Repository
public interface ComplaintDao extends JpaRepository<Complaints, Integer>
{

}
