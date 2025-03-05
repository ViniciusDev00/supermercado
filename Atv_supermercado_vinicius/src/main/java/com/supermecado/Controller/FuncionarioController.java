package com.supermercado.controller;

import com.supermercado.database.DatabaseSimulado;
import com.supermercado.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping
    public List<Funcionario> obterTodosFuncionarios() {
        return DatabaseSimulado.funcionarios;
    }

    @PostMapping
    public String adicionarNovoFuncionario(@RequestBody Funcionario funcionario) {
        DatabaseSimulado.funcionarios.add(funcionario);
        return "Funcionário registrado com sucesso!";
    }
}
