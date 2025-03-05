package com.supermercado.model;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class Venda {
    private Long id;
    private String cliente;
    private Date dataVenda;
    private List<Produto> produtos;
    private double valorTotal;
}
