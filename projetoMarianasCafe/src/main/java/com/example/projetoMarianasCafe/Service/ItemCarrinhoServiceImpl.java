package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import com.example.projetoMarianasCafe.Model.Produto;
import com.example.projetoMarianasCafe.Repository.ItemCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;
import java.util.Optional;

@Service("itemCarrinhoService")
public class ItemCarrinhoServiceImpl implements ItemCarrinhoService{

    @Autowired
    ItemCarrinhoRepository itemCarrinhoRepository;

    @Override
    public Optional<ItemCarrinho> getItemCarrinhoById(Integer id) {
        return itemCarrinhoRepository.findById(id);
    }

    @Override
    public List<ItemCarrinho> getAllItensCarrinho() {
        return itemCarrinhoRepository.findAll();
    }

    @Override
    public void deleteAllItensCarrinho() {
        itemCarrinhoRepository.deleteAll();
    }

    @Override
    public void deleteItemCarrinhoById(Integer id) {
        itemCarrinhoRepository.deleteById(id);
    }

    @Override
    public void updateItemCarrinhoById(Integer id, ItemCarrinho itemCarrinho) {
        Optional<ItemCarrinho> getItemCarrinho = getItemCarrinhoById(id);
        getItemCarrinho.get().setProduto(itemCarrinho.getProduto());
        getItemCarrinho.get().setQuantidade(itemCarrinho.getQuantidade());
        getItemCarrinho.get().setSubtotal(itemCarrinho.getQuantidade()*itemCarrinho.getProduto().getPreco());

        itemCarrinhoRepository.save(itemCarrinho);

    }

    @Override
    public void updateItemCarrinho(ItemCarrinho itemCarrinho) {
        itemCarrinhoRepository.save(itemCarrinho);
    }

    @Override
    public void insertItemCarrinho(ItemCarrinho itemCarrinho) {
        itemCarrinhoRepository.save(itemCarrinho);
    }

    @Override
    public List<Integer> getAllItensCarrinhoByIdCarrinho(Integer id_carrinho) {
        return itemCarrinhoRepository.getAllItensCarrinhoByIdCarrinho(id_carrinho);
    }
}
