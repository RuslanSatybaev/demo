package com.example.hospital.demo.repository;

import com.example.hospital.demo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// принцип ООП: абстракция-реализация - здесь описываем все доступные способы доступа к данным
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // List<Patient> findByPatientId(Long patientId);

    // если title == null или =='', то получим все значения
//    @Query("SELECT c FROM Patient c where " +
//            "(:title is null or :title='' or lower(c.title) like lower(concat('%', :title,'%')))  " +
//            "order by c.title asc")
//    List<Patient> findByTitle(@Param("title") String title);
//
//    // получить все значения, сортировка по id
//    List<Patient> findAllByOrderByIdAsc();

}
