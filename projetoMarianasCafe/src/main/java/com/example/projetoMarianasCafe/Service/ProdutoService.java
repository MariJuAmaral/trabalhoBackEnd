package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Cliente;
import com.example.projetoMarianasCafe.Model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    Optional<Produto> getProdutoById(Integer id);
    List<Produto> getAllProdutos();
    void deleteAllProdutos();
    void deleteProdutoById(Integer id);
    void updateProdutoById(Integer id, Produto produto);
    void updateProduto(Produto produto);
    void insertProduto(Produto produto);
    List<Produto> getAllProdutosByListaId(List<Integer> id_produto);
}
