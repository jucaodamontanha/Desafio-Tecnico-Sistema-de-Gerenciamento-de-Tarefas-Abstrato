package com.example.tarefas.repositories;

import com.example.tarefas.model.ListaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository extends JpaRepository<ListaModel, Long> {
}
