package com.hms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.hms.repository.DoctorRepository;
import com.hms.model.Doctor;

@Service
public class DoctorService {
@Autowired
DoctorRepository repo;
public List<Doctor> getAll(){ return repo.findAll(); }
public Doctor save(Doctor d){ return repo.save(d); }
}