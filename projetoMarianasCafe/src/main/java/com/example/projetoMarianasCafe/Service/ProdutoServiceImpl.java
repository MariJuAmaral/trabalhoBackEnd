package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Produto;
import com.example.projetoMarianasCafe.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("produtoService")
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public Optional<Produto> getProdutoById(Integer id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public void deleteAllProdutos() {
        produtoRepository.deleteAll();
    }

    @Override
    public void deleteProdutoById(Integer id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public void updateProdutoById(Integer id, Produto produto) {

        Optional<Produto> getProduto = getProdutoById(id);
        getProduto.get().setNome(produto.getNome());
        getProduto.get().setDescricao(produto.getDescricao());
        getProduto.get().setPreco(produto.getPreco());
        getProduto.get().setEstoque(produto.getEstoque());

        produtoRepository.save(produto);

    }

    @Override
    public void updateProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void insertProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAllProdutosByListaId(List<Integer> id_produto) {
        return produtoRepository.getAllProdutosByListaId(id_produto);
    }
}
