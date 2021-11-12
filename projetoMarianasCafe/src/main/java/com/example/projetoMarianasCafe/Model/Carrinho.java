package com.example.projetoMarianasCafe.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Carrinho {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Double subtotal;

    @OneToMany(mappedBy="carrinho")
    private Set<ItemCarrinho> produtos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Set<ItemCarrinho> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<ItemCarrinho> produtos) {
        this.produtos = produtos;
    }
}
