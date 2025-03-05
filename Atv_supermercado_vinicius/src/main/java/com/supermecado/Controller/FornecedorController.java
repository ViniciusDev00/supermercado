package com.supermecado.Controller;


import com.supermecado.DataBase.DatabaseSimulado;
import com.supermecado.model.Fornecedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fornecedores")
public class FornecedorController {

    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return DatabaseSimulado.fornecedores;
    }

    @PostMapping
    public String adicionarFornecedor(@RequestBody Fornecedor fornecedor) {
        DatabaseSimulado.fornecedores.add(fornecedor);
        return "Fornecedor adicionado com sucesso!";
    }

    @DeleteMapping("")
    public String removerFornecedor(@PathVariable Long id) {
        DatabaseSimulado.fornecedores.removeIf(fornecedor -> fornecedor.getId().equals(id));
        return "Fornecedor removido com sucesso!";
    }
}