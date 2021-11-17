package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import com.example.projetoMarianasCafe.Service.CarrinhoService;
import com.example.projetoMarianasCafe.Service.CompraService;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringBDRestController {

    @Autowired
    private CarrinhoService carrinhoService;
    private ItemCarrinhoService itemCarrinhoService;
    private CompraService compraService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)

    public List<ItemCarrinho> getAllItensCarrinho() {

        return itemCarrinhoService.getAllItensCarrinho();

    }
}
