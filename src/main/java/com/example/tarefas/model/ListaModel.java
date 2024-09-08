package com.example.tarefas.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ListaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemModel> itens = new ArrayList<>();

    public ListaModel(Long id, String nome, List<ItemModel> itens) {
        this.id = id;
        this.nome = nome;
        this.itens = itens;
    }

    public ListaModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ItemModel> getItens() {
        return itens;
    }

    public void setItens(List<ItemModel> itens) {
        this.itens = itens;
    }
}
