package com.android.crudspringbootrakuten.controller;

import com.android.crudspringbootrakuten.model.Usuario;
import com.android.crudspringbootrakuten.service.UsuarioS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rakutentv")
public class UsuarioC {

    @Autowired
    UsuarioS service;

    @GetMapping("/usuarios")
    public List<Usuario> getAll() {
        return service.getAll();
    }

    @GetMapping("/login/{email}/{password}")
    public Usuario getLoginUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return service.getLoginUser(email, password);
    }

    @PostMapping("/nuevo")
    public Usuario addUser(@RequestBody Usuario usuario) {
        service.add(usuario);
        return service.getEmail(usuario.getEmail());
    }
}
