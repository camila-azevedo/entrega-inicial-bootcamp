package com.example.githubentregainicial;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "*")
public class ControladorProduto {
    private static List<Produto> listaDeCompras = new ArrayList<>();

    static {
        listaDeCompras.add(new Produto("Farinha de Trigo", 1));
        listaDeCompras.add(new Produto("Manteiga", 1));
        listaDeCompras.add(new Produto("Chocolate", 0));
    }

    @GetMapping
    public List<Produto> listar() {
        return listaDeCompras;
    }

    // BOTÃO SALVAR
    @PostMapping
    public Produto salvar(@RequestBody Produto novoProduto) {
        listaDeCompras.add(novoProduto);
        return novoProduto;
    }

    // Botão
}
