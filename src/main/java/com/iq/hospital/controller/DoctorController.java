package com.iq.hospital.controller;

import com.iq.hospital.dao.DoctorRepo;
import com.iq.hospital.model.Doctor;
import com.iq.hospital.model.Page;
import com.iq.hospital.model.PageDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {

    @Autowired
    DoctorRepo repo;

    @PostMapping("/createDoctorDetails")
    public Doctor createDoctorDetails(@RequestBody Doctor doctor) {
        System.out.println(doctor.toString());
        return repo.save(doctor);
    }

    @GetMapping("/getDoctorDetails/{id}")
    public Optional<Doctor> getDoctorDetails(@PathVariable("id") int id) {
        return repo.findBy_id(id);
    }

    @PutMapping("/updateDoctorDetails/{id}")
    public Doctor updateDoctorDetails(@RequestBody Doctor doctor) {
        return repo.save(doctor);
    }

    @DeleteMapping("deleteDoctor/{id}")
    public boolean deleteDoctor(@PathVariable("id") int id) {
        repo.deleteBy_id(id);
        return true;
    }

    @PostMapping("/getDoctors")
    public PageDocument getDoctors(@RequestBody Page page) {
        PageDocument pageDocument = new PageDocument();

        List<Doctor> doctorList = repo.findAll();
        int size = doctorList.size();

        pageDocument.setDocs(doctorList);
        pageDocument.setLimit(page.getLimit());
        pageDocument.setPages(size/page.getLimit());
        pageDocument.setTotal(size);
        return pageDocument;
    }

}
