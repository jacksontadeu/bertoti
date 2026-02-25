package com.jtmjinfo.coffethymeleaf.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coffee {

    private Long id;
    private String nome;
    private String descricao;
    private String tipo;
    private BigDecimal preco;

}
