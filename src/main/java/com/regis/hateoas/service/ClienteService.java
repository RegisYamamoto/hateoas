package com.regis.hateoas.service;

import com.regis.hateoas.model.Cliente;
import com.regis.hateoas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> buscarTodosClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }
    public Optional<Cliente> buscarClientePorId(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente;
    }

}
