package com.iq.hospital.dao;

import com.iq.hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
    Optional<Doctor> findBy_id(int id);

    @Transactional
    void deleteBy_id(int id);
}
