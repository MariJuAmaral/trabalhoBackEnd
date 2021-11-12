package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Cliente;
import com.example.projetoMarianasCafe.Model.Compra;
import com.example.projetoMarianasCafe.Repository.CarrinhoRepository;
import com.example.projetoMarianasCafe.Repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("compraService")
public class CompraServiceImpl implements CompraService{

    @Autowired
    CompraRepository compraRepository;

    @Override
    public Optional<Compra> getCompraById(Integer id) {
        return compraRepository.findById(id);
    }

    @Override
    public List<Compra> getAllCompras() {
        return compraRepository.findAll();
    }

    @Override
    public void deleteAllCompras() {
        compraRepository.deleteAll();
    }

    @Override
    public void deleteCompraById(Integer id) {
        compraRepository.deleteById(id);
    }

    @Override
    public void updateCompraById(Integer id, Compra compra) {

        Optional<Compra> getCompra = getCompraById(id);
        getCompra.get().setCarrinho(compra.getCarrinho());
        getCompra.get().setCliente(compra.getCliente());
        getCompra.get().setTotal(compra.getTotal());
        getCompra.get().setValorPago(compra.getValorPago());
        getCompra.get().setTroco(compra.getTotal()-compra.getValorPago());

        compraRepository.save(compra);

    }

    @Override
    public void updateCompra(Compra compra) {
        compraRepository.save(compra);
    }

    @Override
    public void insertCompra(Compra compra) {
        compraRepository.save(compra);
    }

    @Override
    public List<Compra> getAllComprasByCliente(Integer cliente_id) {
        return compraRepository.getAllComprasByCliente(cliente_id);
    }
}
