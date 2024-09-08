package com.example.tarefas.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Anotação que indica que esta classe é uma entidade JPA
@Entity
public class ListaModel {
    // Anotação que indica que este campo é a chave primária
    @Id
    // Anotação que indica que o valor da chave primária será gerado automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    // Anotação que indica um relacionamento um-para-muitos com a entidade ItemModel
    // CascadeType.ALL indica que todas as operações (persistir, mesclar, remover, etc.) serão propagadas para os itens
    // orphanRemoval = true indica que itens órfãos (sem referência) serão removidos
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemModel> itens = new ArrayList<>();

    // Construtor com todos os campos
    public ListaModel(Long id, String nome, List<ItemModel> itens) {
        this.id = id;
        this.nome = nome;
        this.itens = itens;
    }
    // Construtor padrão
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
