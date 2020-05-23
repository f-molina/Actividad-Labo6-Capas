package com.uca.capas.labo6.dao;

import java.util.List;

import com.uca.capas.labo6.domain.Estudiante;

import org.springframework.dao.DataAccessException;

public interface EstudianteDAO {

    public List<Estudiante> findAll() throws DataAccessException;
    
    public Estudiante findOne(Integer code) throws DataAccessException;

    public void save(Estudiante estudiante) throws DataAccessException;

    public void delete(Integer codigoEstudiante) throws DataAccessException;
    
}