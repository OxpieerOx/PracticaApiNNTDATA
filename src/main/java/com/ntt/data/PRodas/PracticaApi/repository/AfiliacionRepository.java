package com.ntt.data.PRodas.PracticaApi.repository;

import com.ntt.data.PRodas.PracticaApi.entity.Afiliacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AfiliacionRepository extends JpaRepository<Afiliacion,Integer> {

    @Query(nativeQuery = true,value ="SELECT COUNT(*) FROM tb_afiliacion WHERE dni_afiliacion=:dniafiliacion")
    public int validarIdAfiliacion(@Param("dniafiliacion")String dniafiliacion);

    @Query(nativeQuery = true,value ="SELECT * FROM tb_afiliacion WHERE dni_afiliacion=:dni")
    public Afiliacion getAfiliacionByDni(String dni);

}