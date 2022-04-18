package com.eventosapp.eventosapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Convidado {

    @Id
    private String rg;
    private String nomeConvidado;
    @ManyToOne
    private Evento evento;

}
