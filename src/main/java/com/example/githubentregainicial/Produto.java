package com.example.githubentregainicial;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto", schema = "compras")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;

    @Column(name = "nome_produto", unique = true)
    private String nome;

    @Column(name = "qtd_produto")
    private Integer quantidade;

    public Produto() {}

    public Produto(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Métodos Get e Set
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}