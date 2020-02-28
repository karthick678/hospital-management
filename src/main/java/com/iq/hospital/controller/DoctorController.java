package com.iq.hospital.controller;

import com.iq.hospital.model.Doctor;
import com.iq.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DoctorController {

    @Autowired(required = true)
    private DoctorService doctorService;

    @PostMapping("/createDoctorDetails")
    public Doctor createDoctorDetails(@RequestBody Doctor doctor) {
        return doctorService.createDoctorDetails(doctor);
    }

    @DeleteMapping("deleteDoctor/{id}")
    public boolean deleteDoctor(@PathVariable("id") int id) {
        doctorService.deleteDoctor(id);
        return true;
    }

    @GetMapping("/getDoctorDetails/{id}")
    public Optional<Doctor> getDoctorDetails(@PathVariable("id") int id) {
        return doctorService.getDoctorDetails(id);
    }

    @PutMapping("/updateDoctorDetails/{id}")
    public Doctor updateDoctorDetails(@RequestBody Doctor doctor) {
        return doctorService.updateDoctorDetails(doctor);
    }

}
