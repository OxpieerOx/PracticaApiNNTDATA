package com.ntt.data.PRodas.PracticaApi.controller;


import com.ntt.data.PRodas.PracticaApi.entity.Usuario;
import com.ntt.data.PRodas.PracticaApi.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioservice;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listAll() {
        return new ResponseEntity<>(this.usuarioservice.listarUsuarios(), HttpStatus.OK);
    }

    @PostMapping("insertar")
    public ResponseEntity<Usuario> crearusuario(@RequestBody Usuario usuario) throws Exception{
       Usuario insertaranuncioalbergue;
        insertaranuncioalbergue = usuarioservice.guardarUsuarios(usuario);
        if( insertaranuncioalbergue==null) {
            throw new Exception("No se ha podido guardar");
        }
        return ResponseEntity.ok(insertaranuncioalbergue);
    }




}
