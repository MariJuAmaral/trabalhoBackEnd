package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Service.CarrinhoService;
import com.example.projetoMarianasCafe.Service.CompraService;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringBDController {

    @Autowired
    private CarrinhoService carrinhoService;
    private ItemCarrinhoService itemCarrinhoService;
    private CompraService compraService;

    @RequestMapping(value = "/")
    public ModelAndView index(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

                return mav;
    }
}
