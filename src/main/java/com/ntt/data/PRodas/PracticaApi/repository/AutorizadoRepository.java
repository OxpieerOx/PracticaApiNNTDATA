package com.ntt.data.PRodas.PracticaApi.repository;

import com.ntt.data.PRodas.PracticaApi.entity.Autorizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorizadoRepository extends JpaRepository<Autorizado,Integer> {

@Query(nativeQuery = true,value ="SELECT COUNT(*) FROM tb_anuncios_albergue WHERE id_anuncios_albergue=:idalbergue")
public int validarIdAlbergue(@Param("idalbergue")int idalbergue);

        }