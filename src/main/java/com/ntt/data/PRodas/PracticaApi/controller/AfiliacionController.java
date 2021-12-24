package com.ntt.data.PRodas.PracticaApi.controller;

import com.ntt.data.PRodas.PracticaApi.dto.Dto;
import com.ntt.data.PRodas.PracticaApi.entity.Afiliacion;
import com.ntt.data.PRodas.PracticaApi.entity.Autorizado;
import com.ntt.data.PRodas.PracticaApi.service.impl.AfiliacionService;
import com.ntt.data.PRodas.PracticaApi.service.impl.AutorizadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Afiliacion")
public class AfiliacionController {

    @Autowired
    private AfiliacionService afiliacionService;

    @GetMapping("/listar")
    public ResponseEntity<List<Afiliacion>> listAll() {
        return new ResponseEntity<>(this.afiliacionService.listarAfiliacion(), HttpStatus.OK);
    }


    @PostMapping("insertar")
    public ResponseEntity<?> crearafiliacion(@RequestBody Afiliacion afiliacion) {
        String eugeo1=afiliacion.getUbigeo();
        String eugeo2= afiliacion.getAutorizado().getUbigeoAuto();


        if(eugeo1.equals(eugeo2)){
            String dniafiliacion = afiliacion.getDni();
            if(afiliacionService.validarIDAfiliacion(dniafiliacion)<=0) {
                return new ResponseEntity<>(this.afiliacionService.guardarAfiliacion(afiliacion), HttpStatus.OK);
            }
            else {
                Dto response = new Dto();
                response.setMessage("no se puede registrar un usuario con el mismo dni ");
                return new ResponseEntity<>(response, HttpStatus.OK);

            }
        }else{
            Dto response = new Dto();
            response.setMessage("no se puede registrar con los eugeos diferentes ");
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }



    @GetMapping("buscar/{id}")
    public ResponseEntity<Afiliacion> buscardni(@PathVariable("id")int id){
        return new ResponseEntity<>(this.afiliacionService.retornarAfiliacion(id),HttpStatus.OK);
    }
    }

