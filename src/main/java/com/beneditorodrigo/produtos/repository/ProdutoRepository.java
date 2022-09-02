package com.beneditorodrigo.produtos.repository;

import com.beneditorodrigo.produtos.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
