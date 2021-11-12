package com.example.projetoMarianasCafe.Repository;

import com.example.projetoMarianasCafe.Model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("carrinhoRepository")
public interface CarrinhoRepository extends JpaRepository<Carrinho,Integer> {
}