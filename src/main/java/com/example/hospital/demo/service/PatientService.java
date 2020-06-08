package com.example.hospital.demo.service;


import com.example.hospital.demo.entity.Patient;

import java.util.List;

public interface PatientService {
    /**
     * Создает нового клиента
     * @param patient - клиент для создания
     */
    void create(Patient patient);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Patient> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    Patient read(Long id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param patient - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Patient patient, Long id);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(Long id);
}
