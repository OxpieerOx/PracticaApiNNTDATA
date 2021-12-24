package com.ntt.data.PRodas.PracticaApi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario")
@Data
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Usuario {

    @Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMascota;

    @Column(name = "nombres", nullable = false, length = 30)
    private String nombres;

    @Column(name = "dni", nullable = false, length = 20)
    private int dni;

    @Column(name = "apePaterno", nullable = false, length = 20)
    private String apePaterno;

    @Column(name = "apeMaterno", nullable = false, length = 45)
    private String apeMaterno;

    @Column(name = "fecha", nullable = false, length = 45)
    private String fecha;


}