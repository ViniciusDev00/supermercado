package com.supermecado.model;

import lombok.Data;

@Data
public class Produto {
    private Long id;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;
    private boolean disponivel;
}