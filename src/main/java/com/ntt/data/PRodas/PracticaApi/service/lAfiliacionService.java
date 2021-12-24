package com.ntt.data.PRodas.PracticaApi.service;

import com.ntt.data.PRodas.PracticaApi.entity.Afiliacion;
import com.ntt.data.PRodas.PracticaApi.entity.Autorizado;

import java.util.List;
import java.util.Optional;

public interface lAfiliacionService {
    public List<Afiliacion> listarAfiliacion();
    public Afiliacion retornarAfiliacion(int idAfiliacion);
    public Afiliacion guardarAfiliacion(Afiliacion afiliacion);
    public Afiliacion editarAfiliacion(Afiliacion afiliacion);
    public void eliminarAfiliacion(int idafiliacion);
    public int validarIDAfiliacion(String dniafiliacion);
    public Afiliacion obtenerAfiliacionbydni(String dniafiliacion);


}
