package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Cliente;
import com.example.projetoMarianasCafe.Model.Compra;
import com.example.projetoMarianasCafe.Model.Produto;

import java.util.List;
import java.util.Optional;

public interface CompraService {
    Optional<Compra> getCompraById(Integer id);
    List<Compra> getAllCompras();
    void deleteAllCompras();
    void deleteCompraById(Integer id);
    void updateCompraById(Integer id, Compra compra);
    void updateCompra(Compra compra);
    void insertCompra(Compra compra);
    List<Compra> getAllComprasByCliente(Integer cliente_id);
}
