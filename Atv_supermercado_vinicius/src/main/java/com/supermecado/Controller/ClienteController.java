package com.supermecado.Controller;


import com.supermecado.DataBase.DatabaseSimulado;
import com.supermecado.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ClienteController {

    @GetMapping
    public List<Cliente> listarClientes() {
        return DatabaseSimulado.clientes;
    }

    @PostMapping
    public String adicionarCliente(@RequestBody Cliente cliente) {
        DatabaseSimulado.clientes.add(cliente);
        return "Cliente adicionado com sucesso!";
    }
}