package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Service.CarrinhoService;
import com.example.projetoMarianasCafe.Service.CompraService;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBDRestController {

    @Autowired
    private CarrinhoService carrinhoService;
    private ItemCarrinhoService itemCarrinhoService;
    private CompraService compraService;
}
