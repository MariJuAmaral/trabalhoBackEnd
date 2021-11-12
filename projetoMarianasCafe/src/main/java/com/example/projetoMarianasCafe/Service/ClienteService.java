package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Optional<Cliente> getClienteById(Integer id);
    List<Cliente> getAllClientes();
    void deleteAllClientes();
    void deleteClienteById(Integer id);
    void updateClienteById(Integer id, Cliente cliente);
    void updateCliente(Cliente cliente);
    void insertCliente(Cliente cliente);
}
