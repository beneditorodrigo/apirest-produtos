package com.beneditorodrigo.produtos.resources;

import com.beneditorodrigo.produtos.models.Produto;
import com.beneditorodrigo.produtos.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/produto")
    @ApiOperation(value = "Salva um Produto no BD")
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @GetMapping("/produtos")
    @ApiOperation(value = "Retorna uma lista de Produto")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{id}")
    @ApiOperation(value = "Retorna um Produto único por ID")
    public Produto buscarProduto(@PathVariable long id){
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Deleta um Produto do BD")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value = "Atualiza um Produto no BD")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
