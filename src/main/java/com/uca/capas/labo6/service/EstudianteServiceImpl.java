package com.uca.capas.labo6.service;

import java.util.List;

import javax.transaction.Transactional;

import com.uca.capas.labo6.dao.EstudianteDAO;
import com.uca.capas.labo6.domain.Estudiante;
import com.uca.capas.labo6.repositories.EstudianteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepo estudianteRepo;
    //private EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAll() throws DataAccessException {
       // return estudianteRepo.findAll();
       return estudianteRepo.mostrarTodos();
    }

    @Override
    public Estudiante findOne(Integer code) throws DataAccessException {
        return estudianteRepo.getOne(code);
    }

    @Override
    @Transactional
    public void save(Estudiante estudiante) throws DataAccessException {
        estudianteRepo.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(Integer codigoEstudiante) throws DataAccessException {
        estudianteRepo.deleteById(codigoEstudiante);
    }

    @Override
    public List<Estudiante> filtrarPor(String cadena) throws DataAccessException {
        return estudianteRepo.findByNombre(cadena);
        //return estudianteRepo.mostrarPorNombre(cadena);
    }

    @Override
    public List<Estudiante> empiezaCon(String cadena) throws DataAccessException {
        return estudianteRepo.findByApellidoStartingWith(cadena);
    }

}