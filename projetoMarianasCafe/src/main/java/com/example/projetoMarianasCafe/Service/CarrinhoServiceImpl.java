package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Carrinho;
import com.example.projetoMarianasCafe.Model.Produto;
import com.example.projetoMarianasCafe.Repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("carrinhoService")
public class CarrinhoServiceImpl implements CarrinhoService{

    @Autowired
    CarrinhoRepository carrinhoRepository;

    @Override
    public Optional<Carrinho> getCarrinhoById(Integer id) {
        return carrinhoRepository.findById(id);
    }

    @Override
    public List<Carrinho> getAllCarrinhos() {
        return carrinhoRepository.findAll();
    }

    @Override
    public void deleteAllCarrinhoss() {
        carrinhoRepository.deleteAll();
    }

    @Override
    public void deleteCarrinhoById(Integer id) {
        carrinhoRepository.deleteById(id);
    }

    @Override
    public void updateCarrinhoById(Integer id, Carrinho carrinho) {

        Optional<Carrinho> getCarrinho = getCarrinhoById(id);
        getCarrinho.get().setProdutos(carrinho.getProdutos());
        getCarrinho.get().setSubtotal(carrinho.getSubtotal());

        carrinhoRepository.save(carrinho);
    }

    @Override
    public void updateCarrinho(Carrinho carrinho) {
        carrinhoRepository.save(carrinho);
    }

    @Override
    public void insertCarrinho(Carrinho carrinho) {
        carrinhoRepository.save(carrinho);
    }
}
