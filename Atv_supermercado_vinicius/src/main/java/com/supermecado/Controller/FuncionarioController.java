package com.supermecado.Controller;



import com.supermecado.DataBase.DatabaseSimulado;
import com.supermecado.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Funcionarios")
public class FuncionarioController {

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return DatabaseSimulado.funcionarios;
    }

    @PostMapping
    public String adicionarFuncionario(@RequestBody Funcionario funcionario) {
        DatabaseSimulado.funcionarios.add(funcionario);
        return "Funcionário adicionado com sucesso!";
    }
}