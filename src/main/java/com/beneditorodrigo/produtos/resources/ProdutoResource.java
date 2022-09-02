package com.beneditorodrigo.produtos.resources;

import com.beneditorodrigo.produtos.models.Produto;
import com.beneditorodrigo.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/produto")
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Produto buscarProduto(@PathVariable long id){
        return produtoRepository.findById(id);
    }
}
