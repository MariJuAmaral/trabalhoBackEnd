package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Carrinho;
import com.example.projetoMarianasCafe.Model.Produto;

import java.util.List;
import java.util.Optional;

public interface CarrinhoService {
    Optional<Carrinho> getCarrinhoById(Integer id);
    List<Carrinho> getAllCarrinhos();
    void deleteAllCarrinhoss();
    void deleteCarrinhoById(Integer id);
    void updateCarrinhoById(Integer id, Carrinho carrinho);
    void updateCarrinho(Carrinho carrinho);
    void insertCarrinho(Carrinho carrinho);
}
