package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import com.example.projetoMarianasCafe.Model.Produto;

import java.util.List;
import java.util.Optional;

public interface ItemCarrinhoService {
    Optional<ItemCarrinho> getItemCarrinhoById(Integer id);
    List<ItemCarrinho> getAllItensCarrinho();
    void deleteAllItensCarrinho();
    void deleteItemCarrinhoById(Integer id);
    void updateItemCarrinhoById(Integer id, ItemCarrinho itemCarrinho);
    void updateItemCarrinho(ItemCarrinho itemCarrinho);
    void insertItemCarrinho(ItemCarrinho itemCarrinho);
    List<Integer> getAllItensCarrinhoByIdCarrinho(Integer id_carrinho);
}
