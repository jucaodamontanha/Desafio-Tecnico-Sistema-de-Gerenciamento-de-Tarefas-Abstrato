package com.example.tarefas.service;

import com.example.tarefas.model.ItemModel;
import com.example.tarefas.model.ListaModel;
import com.example.tarefas.repositories.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// Anotação que indica que esta classe é um serviço do Spring
@Service
public class GerenciamentoTarefasService {
    // Injeta uma instância de ListaRepository
    @Autowired
    private ListaRepository listaRepository;

    // Método para criar uma nova lista
    public ListaModel criarLista(String nome){
        ListaModel listaModel = new ListaModel();
        listaModel.setNome(nome);
        return listaRepository.save(listaModel);
    }

    // Método para adicionar um item a uma lista existente
    public ItemModel adicionarItem(Long ListaId, ItemModel itemModel){
        ListaModel listaModel = listaRepository.findById(ListaId).orElseThrow(() ->
                new RuntimeException("Lista nã0 encontrada"));
        listaModel.getItens().add(itemModel);
        listaRepository.save(listaModel);
        return itemModel;
    }
    // Método para remover um item de uma lista existente
    public void removerItem(Long ListaId, Long intemId){
        ListaModel listaModel = listaRepository.findById(ListaId).orElseThrow(() ->
                new RuntimeException("Lista nã0 encontrada"));
        listaModel.getItens().removeIf(itemModel -> itemModel.getId().equals(intemId));
        listaRepository.save(listaModel);
    }
    // Método para obter todas as listas
    public List<ListaModel> getLista(){
        return listaRepository.findAll();
    }


}
