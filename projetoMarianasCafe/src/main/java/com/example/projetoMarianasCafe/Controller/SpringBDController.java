package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Service.CarrinhoService;
import com.example.projetoMarianasCafe.Service.CompraService;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringBDController {

    @Autowired
    private CarrinhoService carrinhoService;
    private ItemCarrinhoService itemCarrinhoService;
    private CompraService compraService;
}
