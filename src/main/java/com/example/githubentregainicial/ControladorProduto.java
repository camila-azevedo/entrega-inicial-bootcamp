package com.example.githubentregainicial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ControladorProduto {

    @Autowired
    private PersistenciaProduto persistencia; // Usando o novo nome que você escolheu

    @GetMapping
    public List<Produto> listar() {
        return persistencia.findAll();
    }

    @PostMapping
    public Produto salvarOuSubstituir(@RequestBody Produto novoProduto) {
        // Se achar o nome no banco, substitui a quantidade. Se não, cria um novo.
        return persistencia.findByNomeIgnoreCase(novoProduto.getNome())
                .map(produtoExistente -> {
                    produtoExistente.setQuantidade(novoProduto.getQuantidade());
                    return persistencia.save(produtoExistente);
                })
                .orElseGet(() -> {
                    return persistencia.save(novoProduto);
                });
    }
}
