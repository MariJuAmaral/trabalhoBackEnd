package com.example.projetoMarianasCafe.Repository;

import com.example.projetoMarianasCafe.Model.Cliente;
import com.example.projetoMarianasCafe.Model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("compraRepository")
public interface CompraRepository extends JpaRepository<Compra,Integer> {

    @Query(value = "SELECT * FROM COMPRA WHERE CLIENTE_ID  = ?1", nativeQuery = true)
    List<Compra> getAllComprasByCliente(Integer cliente_id);
}