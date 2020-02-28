package com.iq.hospital.service.impl;

import com.iq.hospital.dao.DoctorRepo;
import com.iq.hospital.model.Doctor;
import com.iq.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepo doctorRepo;

    @Override
    public Doctor createDoctorDetails(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public void deleteDoctor(int id) {
        doctorRepo.deleteBy_id(id);
    }

    @Override
    public Optional<Doctor> getDoctorDetails(int id) {
        return doctorRepo.findBy_id(id);
    }

    @Override
    public Doctor updateDoctorDetails(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

}
