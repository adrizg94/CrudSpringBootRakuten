package com.android.crudspringbootrakuten.repository;

import com.android.crudspringbootrakuten.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioR extends JpaRepository<Usuario, Integer> {

    @Query("FROM Usuario WHERE email = ?1 AND password = ?2")
    Usuario findByEmailAndPassword(String email, String password);

    @Query("FROM Usuario WHERE email = ?1")
    Usuario findByEmail(String email);

}
