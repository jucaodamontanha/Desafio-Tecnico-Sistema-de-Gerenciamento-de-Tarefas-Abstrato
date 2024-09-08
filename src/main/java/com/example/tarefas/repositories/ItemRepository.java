package com.example.tarefas.repositories;

import com.example.tarefas.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository  extends JpaRepository<ItemModel, Long> {
}
