package com.example.projetoMarianasCafe.Model;

import javax.persistence.*;

@Entity
public class ItemCarrinho {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Double subtotal;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name="produto_id", nullable=false)
    private Produto produto;
    @ManyToOne
    @JoinColumn(name="carrinho_id", nullable=false)
    private Carrinho carrinho;

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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
