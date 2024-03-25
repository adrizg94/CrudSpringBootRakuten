package com.android.crudspringbootrakuten.service;

import com.android.crudspringbootrakuten.interfaces.ServiceI;
import com.android.crudspringbootrakuten.model.Usuario;
import com.android.crudspringbootrakuten.repository.UsuarioR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioS implements ServiceI<Usuario, Integer> {

    @Autowired
    UsuarioR repository;

    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @Override
    public Usuario getId(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Usuario usuario) {
        repository.save(usuario);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Usuario getLoginUser(String email, String password) {
        return repository.findByEmailAndPassword(email, password);
    }

    public Usuario getEmail(String email) {
        return repository.findByEmail(email);
    }

}
