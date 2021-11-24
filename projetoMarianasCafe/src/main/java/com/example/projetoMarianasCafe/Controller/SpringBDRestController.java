package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import com.example.projetoMarianasCafe.Model.Produto;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import com.example.projetoMarianasCafe.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringBDRestController {

    @Autowired
    private ProdutoService produtoService1;
    @Autowired
    private ItemCarrinhoService itemCarrinhoService;


    @RequestMapping(value = "/rest/getAllProdutos", method = RequestMethod.GET)
    public List<Produto> getAllProdutos() {
        return produtoService1.getAllProdutos();
    }

    //itemCarrinho
    @RequestMapping(value = "/rest/insertItemCarrinho", method = RequestMethod.POST)
    public void updateAluno(@RequestBody ItemCarrinho item) {
        itemCarrinhoService.insertItemCarrinho(item);
    }

    @RequestMapping(value = "/rest/getAllItensCarrinho", method = RequestMethod.GET)
    public List<ItemCarrinho> getAllItens() {
        return itemCarrinhoService.getAllItensCarrinho();
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteItens() {
        itemCarrinhoService.deleteAllItensCarrinho();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteItens(@PathVariable("id") Integer id) {
        itemCarrinhoService.deleteItemCarrinhoById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateItens(@RequestBody ItemCarrinho itemCarrinho, @PathVariable("id") Integer id) {
        itemCarrinhoService.updateItemCarrinhoById(id, itemCarrinho);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateItens(@RequestBody ItemCarrinho itemCarrinho) {
        itemCarrinhoService.insertItemCarrinho(itemCarrinho);
    }
}
