package com.HOSPITAL.CRMhospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Doctors;
@Repository
public interface DoctorDao extends JpaRepository<Doctors, Integer>
{

}
