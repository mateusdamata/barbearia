package com.barbearia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_agendada")
    private Date dataAgendada;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "idBarbeiro", referencedColumnName = "id")
    private Usuario barbeiro;
}
