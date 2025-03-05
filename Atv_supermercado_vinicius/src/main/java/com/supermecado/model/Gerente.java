package com.supermercado.model;

import lombok.Data;

@Data
public class Gerente {
    private Long id;
    private String nome;
    private String cpf;

    public void supervisionarEstoque() {
        System.out.println("Gerente supervisionando o estoque...");
    }

    public void supervisionarVendas() {
        System.out.println("Gerente supervisionando as vendas...");
    }
}
