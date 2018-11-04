package com.HOSPITAL.CRMhospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Integer>
{
  
}
