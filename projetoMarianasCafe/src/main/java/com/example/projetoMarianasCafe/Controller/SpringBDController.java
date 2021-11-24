package com.example.projetoMarianasCafe.Controller;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import com.example.projetoMarianasCafe.Service.CarrinhoService;
import com.example.projetoMarianasCafe.Service.CompraService;
import com.example.projetoMarianasCafe.Service.ItemCarrinhoService;
import com.example.projetoMarianasCafe.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringBDController {

    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ItemCarrinhoService itemCarrinhoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("produtos", produtoService.getAllProdutos());
        return mav;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("itensCarrinho", itemCarrinhoService.getAllItensCarrinho());
        mav.addObject("produtos",produtoService.getAllProdutos());
        return mav;

    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "itemCarrinho", new ItemCarrinho());
    }


    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert(@Validated @ModelAttribute("itemCarrinho")ItemCarrinho itemCarrinho, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        itemCarrinhoService.insertItemCarrinho(itemCarrinho);
        return "redirect:";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "itemCarrinho", itemCarrinhoService.getItemCarrinhoById(id).get());
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete(@Validated @ModelAttribute("itemCarrinho")ItemCarrinho itemCarrinho, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }
        itemCarrinhoService.deleteItemCarrinhoById(itemCarrinho.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "itemCarrinho", itemCarrinhoService.getItemCarrinhoById(id).get());
    }



    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate(@Validated @ModelAttribute("itemCarrinho")ItemCarrinho itemCarrinho, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }

        itemCarrinhoService.updateItemCarrinho(itemCarrinho);
        return "redirect:";

    }
}
