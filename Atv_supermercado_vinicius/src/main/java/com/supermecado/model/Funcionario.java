package com.supermecado.model;

import lombok.Data;

@Data
public class Funcionario {
    private Long id;
    private String nome;
    private String cpf;
    private double comissao;
}