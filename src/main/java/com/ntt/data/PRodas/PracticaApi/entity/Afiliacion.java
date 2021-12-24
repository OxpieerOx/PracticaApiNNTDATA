package com.ntt.data.PRodas.PracticaApi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_afiliacion")
@Data
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Afiliacion {

    @Id
    @Column(name = "idAlifiacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAfiliacion;

    @Column(name = "nombres", nullable = false, length = 30)
    private String nombres;

    @Column(name = "dni_afiliacion")
    private String dni;

    @Column(name = "apePaterno", nullable = false, length = 20)
    private String apePaterno;

    @Column(name = "apeMaterno", nullable = false, length = 45)
    private String apeMaterno;

    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;

    @Column(name = "ubigeo", nullable = false, length = 45)
    private String ubigeo;

    @OneToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="idAutorizado")
    private Autorizado autorizado;


}