package com.supermecado.Controller;


import com.supermecado.DataBase.DatabaseSimulado;
import com.supermecado.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produtos")
public class ProdutoController {

    @GetMapping
    public List<Produto> listarProdutos() {
        return DatabaseSimulado.produtos;
    }

    @PostMapping
    public String adicionarProduto(@RequestBody Produto produto) {
        DatabaseSimulado.produtos.add(produto);
        return "Produto adicionado com sucesso!";
    }

    @DeleteMapping("")
    public String removerProduto(@PathVariable Long id) {
        DatabaseSimulado.produtos.removeIf(produto -> produto.getId().equals(id));
        return "Produto removido com sucesso!";
    }
}