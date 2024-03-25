package com.android.crudspringbootrakuten.service;

import com.android.crudspringbootrakuten.interfaces.ServiceI;
import com.android.crudspringbootrakuten.model.Pelicula;
import com.android.crudspringbootrakuten.repository.PeliculaR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaS implements ServiceI<Pelicula, Integer> {

    @Autowired
    PeliculaR repository;
    @Override
    public List<Pelicula> getAll() {
        return repository.findAll();
    }

    @Override
    public Pelicula getId(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Pelicula pelicula) {
        repository.save(pelicula);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Pelicula> findByTitulo(String titulo) {
        return repository.findByTitulo(titulo);
    }

}
