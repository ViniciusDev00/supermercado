package com.supermecado.Controller;


import com.supermecado.DataBase.DatabaseSimulado;
import com.supermecado.model.Compra;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Compras")
public class CompraController {

    @GetMapping
    public List<Compra> listarCompras() {
        return DatabaseSimulado.compras;
    }

    @PostMapping
    public String registrarCompra(@RequestBody Compra compra) {
        DatabaseSimulado.compras.add(compra);
        return "Compra registrada com sucesso!";
    }
}
