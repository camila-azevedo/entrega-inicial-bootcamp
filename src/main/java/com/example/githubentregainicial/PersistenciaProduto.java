package com.example.githubentregainicial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PersistenciaProduto extends JpaRepository<Produto, Long> {

    // Esse metodo evita a duplicidade dos produtos ao pesquisar o nome do produto (ignorando letras maiúsculas)
    Optional<Produto> findByNomeIgnoreCase(String nome);
}
