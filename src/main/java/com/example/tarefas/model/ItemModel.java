package com.example.tarefas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.validator.constraints.Length;

// Anotação que indica que esta classe é uma entidade JPA
@Entity
public class ItemModel {
    // Anotação que indica que este campo é a chave primária
    @Id
    // Anotação que indica que o valor da chave primária será gerado automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Validação que exige que o título tenha pelo menos 3 caracteres
    @Length(min = 3, message = "O título deve ter pelo menos 3 caracteres")
    private String titulo;
    private String descricao;
    private boolean destacado;
    private String estado;

    // Construtor com todos os campos
    public ItemModel(Long id, String titulo, String descricao, boolean destacado, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.destacado = destacado;
        this.estado = estado;
    }
    // Construtor padrão
    public ItemModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDestacado() {
        return destacado;
    }

    public void setDestacado(boolean destacado) {
        this.destacado = destacado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
