package com.uca.capas.labo6.service;

import java.util.List;

import javax.transaction.Transactional;

import com.uca.capas.labo6.dao.EstudianteDAO;
import com.uca.capas.labo6.domain.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAll() throws DataAccessException {
        return estudianteDAO.findAll();
    }

    @Override
    public Estudiante findOne(Integer code) throws DataAccessException {
        return estudianteDAO.findOne(code);
    }

    @Override
    @Transactional
    public void save(Estudiante estudiante) throws DataAccessException {
        estudianteDAO.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(Integer codigoEstudiante) throws DataAccessException {
        estudianteDAO.delete(codigoEstudiante);
    }
}