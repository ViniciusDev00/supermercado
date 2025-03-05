package com.supermercado.controller;

import com.supermercado.database.DatabaseSimulado;
import com.supermercado.model.Compra;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @GetMapping
    public List<Compra> obterTodasCompras() {
        return DatabaseSimulado.compras;
    }

    @PostMapping
    public String registrarNovaCompra(@RequestBody Compra compra) {
        DatabaseSimulado.compras.add(compra);
        return "Compra registrada com sucesso!";
    }
}
