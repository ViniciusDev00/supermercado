package com.supermercado.model;

import lombok.Data;
import java.util.Date;

@Data
public class Compra {
    private Long id;
    private Fornecedor fornecedor;
    private Date dataCompra;
    private double valorCompra;
}
