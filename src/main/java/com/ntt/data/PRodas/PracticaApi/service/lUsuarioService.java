package com.ntt.data.PRodas.PracticaApi.service;

import com.ntt.data.PRodas.PracticaApi.entity.Usuario;

import java.util.List;

public interface lUsuarioService {
    public List<Usuario> listarUsuarios();
    public Usuario retornarUsuarios(int idUsuario);
    public Usuario guardarUsuarios(Usuario usuario);
    public Usuario editarUsuarios(Usuario usuario);
    public void eliminarUsuarios(int idusuario);
    public int validarIDUsuario(int id);
}
