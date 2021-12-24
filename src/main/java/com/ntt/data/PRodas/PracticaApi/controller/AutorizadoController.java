package com.ntt.data.PRodas.PracticaApi.controller;

import com.ntt.data.PRodas.PracticaApi.entity.Afiliacion;
import com.ntt.data.PRodas.PracticaApi.entity.Autorizado;
import com.ntt.data.PRodas.PracticaApi.entity.Usuario;
import com.ntt.data.PRodas.PracticaApi.service.impl.AutorizadoService;
import com.ntt.data.PRodas.PracticaApi.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Autorizado")
public class AutorizadoController {

    @Autowired
    private AutorizadoService autorizadoservice;

    @GetMapping("/listar")
    public ResponseEntity<List<Autorizado>> listAll() {
        return new ResponseEntity<>(this.autorizadoservice.listarAutorizados(), HttpStatus.OK);
    }

    @PostMapping("insertar")
    public ResponseEntity<Autorizado> crearautorizado(@RequestBody Autorizado autorizado) throws Exception{
        Autorizado insertarautorizado;
        insertarautorizado = autorizadoservice.guardarAutorizado(autorizado);
        if( insertarautorizado==null) {
            throw new Exception("No se ha podido guardar");
        }
        return ResponseEntity.ok(insertarautorizado);
    }

    @GetMapping("buscar/{id}")
    public ResponseEntity<Autorizado> buscardni(@PathVariable("id")int id){
        return new ResponseEntity<>(this.autorizadoservice.retornarAutorizado(id),HttpStatus.OK);
    }




}



