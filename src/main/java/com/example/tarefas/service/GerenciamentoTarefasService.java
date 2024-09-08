package com.example.tarefas.service;

import com.example.tarefas.model.ItemModel;
import com.example.tarefas.model.ListaModel;
import com.example.tarefas.repositories.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GerenciamentoTarefasService {

    @Autowired
    private ListaRepository listaRepository;


    public ListaModel criarLista(String nome){
        ListaModel listaModel = new ListaModel();
        listaModel.setNome(nome);
        return listaRepository.save(listaModel);
    }

    public ItemModel adicionarItem(Long ListaId, ItemModel itemModel){
        ListaModel listaModel = listaRepository.findById(ListaId).orElseThrow(() ->
                new RuntimeException("Lista nã0 encontrada"));
        listaModel.getItens().add(itemModel);
        listaRepository.save(listaModel);
        return itemModel;
    }

    public void removerItem(Long ListaId, Long intemId){
        ListaModel listaModel = listaRepository.findById(ListaId).orElseThrow(() ->
                new RuntimeException("Lista nã0 encontrada"));
        listaModel.getItens().removeIf(itemModel -> itemModel.getId().equals(intemId));
        listaRepository.save(listaModel);
    }

    public List<ListaModel> getLista(){
        return listaRepository.findAll();
    }


}
