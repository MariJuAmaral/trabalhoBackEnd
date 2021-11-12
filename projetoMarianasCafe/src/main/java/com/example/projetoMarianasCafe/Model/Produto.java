package com.example.projetoMarianasCafe.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer estoque;

    @OneToMany(mappedBy="produto")
    private Set<ItemCarrinho> produtos;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public Set<ItemCarrinho> getProdutos() {
        return produtos;
    }
    public void setProdutos(Set<ItemCarrinho> produtos) {
        this.produtos = produtos;
    }
}
