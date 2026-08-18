package br.com.senai.patrimonio.model;

import jakarta.persistence.Embedded;

public class Bloco {
    private long id;
    private String nome;
    private Empresa empresa;

    public Bloco (){}

    public Bloco(Long id, String nome, Empresa empresa){
        this.id = id;
        this.nome = nome;

    }

}
