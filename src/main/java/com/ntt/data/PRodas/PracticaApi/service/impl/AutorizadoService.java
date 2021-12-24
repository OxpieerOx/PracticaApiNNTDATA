package com.ntt.data.PRodas.PracticaApi.service.impl;

import com.ntt.data.PRodas.PracticaApi.entity.Autorizado;
import com.ntt.data.PRodas.PracticaApi.repository.AutorizadoRepository;
import com.ntt.data.PRodas.PracticaApi.service.lAutorizadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorizadoService implements lAutorizadoService {

    @Autowired
    AutorizadoRepository autorizadodao;

    @Override
    public List<Autorizado> listarAutorizados() {
        return autorizadodao.findAll();
    }

    @Override
    public Autorizado retornarAutorizado(int idAutorizado) {
        return autorizadodao.getById(idAutorizado);
    }

    @Override
    public Autorizado guardarAutorizado(Autorizado autorizado) {
        return autorizadodao.save(autorizado);
    }

    @Override
    public Autorizado editarAutorizado(Autorizado autorizado) {
        return autorizadodao.save(autorizado);
    }

    @Override
    public void eliminarAutorizado(int idautorizado) {
        autorizadodao.deleteById(idautorizado);
    }

    @Override
    public int validarIDAutorizado(int id) {
        return 0;
    }
}
