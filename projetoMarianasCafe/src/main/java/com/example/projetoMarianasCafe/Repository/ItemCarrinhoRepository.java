package com.example.projetoMarianasCafe.Repository;

import com.example.projetoMarianasCafe.Model.ItemCarrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itemCarrinhoRepository")
public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho,Integer> {

    @Query(value = "SELECT PRODUTO_ID FROM ITEM_CARRINHO WHERE carrinho_id = ?1",nativeQuery = true)
    List<Integer> getAllItensCarrinhoByIdCarrinho(Integer id_carrinho);


}
