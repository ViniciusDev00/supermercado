package com.supermercado.model;

import lombok.Data;

@Data
public class Fornecedor {
    private Long id;
    private String nome;
    private String cnpj;
}
