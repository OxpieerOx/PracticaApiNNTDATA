package com.ntt.data.PRodas.PracticaApi.service.impl;

import com.ntt.data.PRodas.PracticaApi.entity.Afiliacion;
import com.ntt.data.PRodas.PracticaApi.repository.AfiliacionRepository;
import com.ntt.data.PRodas.PracticaApi.service.lAfiliacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfiliacionService implements lAfiliacionService {

    @Autowired
    AfiliacionRepository alifiaciondao;

    @Override
    public List<Afiliacion> listarAfiliacion() {
        return alifiaciondao.findAll();
    }

    @Override
    public Afiliacion retornarAfiliacion(int idAfiliacion) {
        return alifiaciondao.getById(idAfiliacion);
    }

    @Override
    public Afiliacion guardarAfiliacion(Afiliacion afiliacion) {
        return alifiaciondao.save(afiliacion);
    }

    @Override
    public Afiliacion editarAfiliacion(Afiliacion afiliacion) {
        return alifiaciondao.save(afiliacion);
    }

    @Override
    public void eliminarAfiliacion(int idafiliacion) {
        alifiaciondao.deleteById(idafiliacion);
    }

    @Override
    public int validarIDAfiliacion(String dniafiliacion) {

       return alifiaciondao.validarIdAfiliacion(dniafiliacion);
    }

    @Override
    public Afiliacion obtenerAfiliacionbydni(String dniafiliacion) {
        return alifiaciondao.getAfiliacionByDni(dniafiliacion);
    }


}
