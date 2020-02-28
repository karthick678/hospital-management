package com.iq.hospital.service;

import com.iq.hospital.model.Doctor;

import java.util.Optional;

public interface DoctorService {
    Doctor createDoctorDetails(Doctor doctor);
    void deleteDoctor(int id);
    Optional<Doctor> getDoctorDetails (int id);
    Doctor updateDoctorDetails(Doctor doctor);
}
