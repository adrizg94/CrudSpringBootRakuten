package com.android.crudspringbootrakuten.controller;

import com.android.crudspringbootrakuten.model.Pelicula;
import com.android.crudspringbootrakuten.service.PeliculaS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rakutentv")
public class PeliculaC {

    @Autowired
    PeliculaS service;

    @GetMapping("/peliculas")
    public List<Pelicula> getAll() {
        return service.getAll();
    }

}
