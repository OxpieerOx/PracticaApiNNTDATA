package com.ntt.data.PRodas.PracticaApi.service;

import com.ntt.data.PRodas.PracticaApi.entity.Autorizado;
import com.ntt.data.PRodas.PracticaApi.entity.Usuario;

import java.util.List;

public interface lAutorizadoService {

    public List<Autorizado> listarAutorizados();
    public Autorizado retornarAutorizado(int idAutorizado);
    public Autorizado guardarAutorizado(Autorizado autorizado);
    public Autorizado editarAutorizado(Autorizado autorizado);
    public void eliminarAutorizado(int idautorizado);
    public int validarIDAutorizado(int id);
}
