package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import com.example.projetoMarianasCafe.Model.Produto;
import com.example.projetoMarianasCafe.Service.CarrinhoService;
import com.example.projetoMarianasCafe.Service.CompraService;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import com.example.projetoMarianasCafe.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/rest/insertItemCarrinho", method = RequestMethod.POST)
    public void updateAluno(@RequestBody ItemCarrinho item) {
        itemCarrinhoService.insertItemCarrinho(item);
    }
    @RequestMapping(value = "/rest/getAllItensCarrinho", method = RequestMethod.GET)
    public List<ItemCarrinho> getAllItens() {
        return itemCarrinhoService.getAllItensCarrinho();
    }
}
