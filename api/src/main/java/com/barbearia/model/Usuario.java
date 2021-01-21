package com.barbearia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String senha;

    private String telefone;

    private String Sexo;

    @Column(name = "data_nasc")
    private Date dataNascimento;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @ManyToOne
    @JoinColumn(name = "idPerfil", referencedColumnName = "id")
    private Perfil perfil;
}
