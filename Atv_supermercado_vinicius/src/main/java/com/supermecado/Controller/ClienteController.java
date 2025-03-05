package com.supermercado.controller;

import com.supermercado.database.DatabaseSimulado;
import com.supermercado.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public List<Cliente> obterTodosClientes() {
        return DatabaseSimulado.clientes;
    }

    @PostMapping
    public String adicionarNovoCliente(@RequestBody Cliente cliente) {
        DatabaseSimulado.clientes.add(cliente);
        return "Cliente registrado com sucesso!";
    }
}
