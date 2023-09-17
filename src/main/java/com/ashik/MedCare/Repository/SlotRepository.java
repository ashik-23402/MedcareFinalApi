package com.ashik.MedCare.Repository;

import com.ashik.MedCare.Entities.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlotRepository extends JpaRepository<Slot,Integer> {

    public List<Slot>findByDoctorId(Integer doctorid);


}
