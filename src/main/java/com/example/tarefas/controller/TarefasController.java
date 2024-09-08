package com.example.tarefas.controller;

import com.example.tarefas.model.ItemModel;
import com.example.tarefas.model.ListaModel;
import com.example.tarefas.service.GerenciamentoTarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tarefas")
public class TarefasController {

    @Autowired
    private GerenciamentoTarefasService service;

    @PostMapping("/listas")
    public ListaModel criarLista(@RequestBody String nome){
        return service.criarLista(nome);
    }
    @PostMapping("/listas/{listaId}/itens")
    public ItemModel adicionarItem(@PathVariable Long listaId, @RequestBody ItemModel itemModel){
        return service.adicionarItem(listaId, itemModel);
    }
    @DeleteMapping("/listas/{listaId}/itens/{itemId}")
    public void  removerItem (@PathVariable Long listaId, @PathVariable Long intemId){
        service.removerItem(listaId,intemId);
    }
    @GetMapping("/listas")
    public List<ListaModel> getLista(){
        return service.getLista();
    }
}
