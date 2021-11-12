package com.example.projetoMarianasCafe.Service;

import com.example.projetoMarianasCafe.Model.Cliente;
import com.example.projetoMarianasCafe.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Optional<Cliente> getClienteById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void deleteAllClientes() {
        clienteRepository.deleteAll();
    }

    @Override
    public void deleteClienteById(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void updateClienteById(Integer id, Cliente cliente) {
        Optional<Cliente> getCliente = getClienteById(id);
        getCliente.get().setNome(cliente.getNome());
        getCliente.get().setCpf(cliente.getCpf());
        getCliente.get().setEmail(cliente.getEmail());
        getCliente.get().setEndereco(cliente.getEndereco());
        getCliente.get().setTelefone(cliente.getTelefone());

        clienteRepository.save(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void insertCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
