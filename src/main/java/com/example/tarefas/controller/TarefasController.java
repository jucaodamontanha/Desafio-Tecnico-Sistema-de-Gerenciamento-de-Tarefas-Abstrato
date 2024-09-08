package com.example.tarefas.controller;

import com.example.tarefas.model.ItemModel;
import com.example.tarefas.model.ListaModel;
import com.example.tarefas.service.GerenciamentoTarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Anotação que indica que esta classe é um controlador do Spring
@Controller
// Define a rota base para este controlador
@RequestMapping("/tarefas")
public class TarefasController {
    // Injeta uma instância de GerenciamentoTarefasService
    @Autowired
    private GerenciamentoTarefasService service;
    // Mapeia requisições POST para /tarefas/listas para criar uma nova lista
    @PostMapping("/listas")
    public ListaModel criarLista(@RequestBody String nome){
        return service.criarLista(nome);
    }
    // Mapeia requisições POST para /tarefas/listas/{listaId}/itens para adicionar um item a uma lista existente
    @PostMapping("/listas/{listaId}/itens")
    public ItemModel adicionarItem(@PathVariable Long listaId, @RequestBody ItemModel itemModel){
        return service.adicionarItem(listaId, itemModel);
    }
    // Mapeia requisições DELETE para /tarefas/listas/{listaId}/itens/{itemId} para remover um item de uma lista existente
    @DeleteMapping("/listas/{listaId}/itens/{itemId}")
    public void  removerItem (@PathVariable Long listaId, @PathVariable Long intemId){
        service.removerItem(listaId,intemId);
    }
    // Mapeia requisições GET para /tarefas/listas para obter todas as listas
    @GetMapping("/listas")
    public List<ListaModel> getLista(){
        return service.getLista();
    }
}
