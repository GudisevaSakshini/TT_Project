package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hms.model.Doctor;
import com.hms.service.DoctorService;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class DoctorController {

    @Autowired
    DoctorService service;

    @GetMapping("/doctors")
    public List<Doctor> getAll() {
        return service.getAll();
    }

    @PostMapping("/doctors")
    public Doctor addDoctor(@RequestBody Doctor d) {
        return service.save(d);
    }
}