package com.projetos.foodbook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.foodbook.model.Usuario;
import com.projetos.foodbook.repository.UsuarioRepository;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    
    @GetMapping
    public List<Usuario> list(){
        return usuarioRepository.findAll();

    }

}


