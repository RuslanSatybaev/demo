package com.example.hospital.demo.service;


import com.example.hospital.demo.entity.Patient;
import com.example.hospital.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void create(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public List<Patient> readAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient read(Long id) {
        return patientRepository.getOne(id);
    }


    @Override
    public boolean update(Patient patient, Long id) {
        if (patientRepository.existsById(id)) {
            patient.setId(id);
            patientRepository.save(patient);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
