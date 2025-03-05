package com.supermercado.controller;

import com.supermercado.database.DatabaseSimulado;
import com.supermercado.model.Fornecedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @GetMapping
    public List<Fornecedor> obterTodosFornecedores() {
        return DatabaseSimulado.fornecedores;
    }

    @PostMapping
    public String adicionarNovoFornecedor(@RequestBody Fornecedor fornecedor) {
        DatabaseSimulado.fornecedores.add(fornecedor);
        return "Fornecedor registrado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String removerFornecedor(@PathVariable Long id) {
        DatabaseSimulado.fornecedores.removeIf(fornecedor -> fornecedor.getId().equals(id));
        return "Fornecedor removido com sucesso!";
    }
}
