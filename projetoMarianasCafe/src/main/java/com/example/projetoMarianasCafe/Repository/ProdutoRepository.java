package com.example.projetoMarianasCafe.Repository;

import com.example.projetoMarianasCafe.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("produtoRepository")
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    @Query(value = "SELECT * FROM PRODUTO WHERE ID IN (?1)",nativeQuery = true)
    List<Produto> getAllProdutosByListaId(List<Integer> id_produto);
}
