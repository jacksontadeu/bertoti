package com.thehecklers.sburrestdemo.entity.model;

import com.thehecklers.sburrestdemo.entity.enums.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = true, length = 200)
    private String nome;

    @Column(length = 200)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Tipo tipo;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

}
