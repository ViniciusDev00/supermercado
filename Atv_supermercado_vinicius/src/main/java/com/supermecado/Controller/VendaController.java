package com.supermecado.Controller;

import com.supermecado.DataBase.DatabaseSimulado;
import com.supermecado.model.Venda;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vendas")
public class VendaController {

    @GetMapping
    public List<Venda> listarVendas() {
        return DatabaseSimulado.vendas;
    }

    @PostMapping
    public String registrarVenda(@RequestBody Venda venda) {
        DatabaseSimulado.vendas.add(venda);
        return "Venda registrada com sucesso!";
    }
}
