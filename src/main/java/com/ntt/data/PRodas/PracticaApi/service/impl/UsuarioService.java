package com.ntt.data.PRodas.PracticaApi.service.impl;

import com.ntt.data.PRodas.PracticaApi.entity.Usuario;
import com.ntt.data.PRodas.PracticaApi.repository.UsuarioRepository;
import com.ntt.data.PRodas.PracticaApi.service.lUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService  implements lUsuarioService {
    @Autowired
    UsuarioRepository usuariodao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuariodao.findAll();
    }

    @Override
    public Usuario retornarUsuarios(int idUsuario) {

        return usuariodao.getById(idUsuario);
    }

    @Override
    public Usuario guardarUsuarios(Usuario usuario) {
        return usuariodao.save(usuario);
    }

    @Override
    public Usuario editarUsuarios(Usuario usuario) {
        return usuariodao.save(usuario);
    }

    @Override
    public void eliminarUsuarios(int idusuario) {
        usuariodao.deleteById(idusuario);
    }

    @Override
    public int validarIDUsuario(int id) {
        return 0;
    }
}
