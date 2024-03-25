package com.android.crudspringbootrakuten.repository;

import com.android.crudspringbootrakuten.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaR extends JpaRepository<Pelicula, Integer> {

    @Query("FROM Pelicula WHERE titulo = ?1")
    List<Pelicula> findByTitulo(String titulo);


}
