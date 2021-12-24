package com.ntt.data.PRodas.PracticaApi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_autorizado")
@Data
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Autorizado {

    @Id
    @Column(name = "idAutorizado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutorizado;

    @Column(name = "nombres", nullable = false, length = 30)
    private String nombres;

    @Column(name = "dni_autorizado")
    private int dni;

    @Column(name = "apePaterno", nullable = false, length = 20)
    private String apePaterno;

    @Column(name = "apeMaterno", nullable = false, length = 45)
    private String apeMaterno;

    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;

    @Column(name = "ubigeoAuto", nullable = false, length = 45)
    private String ubigeoAuto;


}