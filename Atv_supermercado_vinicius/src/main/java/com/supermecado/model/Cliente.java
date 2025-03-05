package com.supermercado.model;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private List<Date> datasCompras;
    private List<Double> valoresCompras;
}
