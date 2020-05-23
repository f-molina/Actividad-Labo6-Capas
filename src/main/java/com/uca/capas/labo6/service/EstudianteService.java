package com.uca.capas.labo6.service;

import java.util.List;

import com.uca.capas.labo6.domain.Estudiante;

import org.springframework.dao.DataAccessException;

public interface EstudianteService {

    public List<Estudiante> findAll() throws DataAccessException;
    
    public Estudiante findOne(Integer code) throws DataAccessException;

    public void save(Estudiante estudiante) throws DataAccessException;

    public void delete(Integer codigoEstudiante) throws DataAccessException;
    
}