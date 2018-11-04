package com.HOSPITAL.CRMhospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HOSPITAL.CRMhospital.entity.Medicine;
@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer>
{

}
