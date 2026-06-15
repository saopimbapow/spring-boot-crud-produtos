package com.github.saopimbapow.apiestudos.controller;

import com.github.saopimbapow.apiestudos.Repository.ProdutoRepository;
import com.github.saopimbapow.apiestudos.model.produto;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
import java.util.List;
@RestController
@RequestMapping("produtos")
public class Produtocontroller {


    private ProdutoRepository produtoRepository;

    public Produtocontroller(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public produto salvar(@RequestBody produto produto) {
        System.out.println("Produtos Recebidos: " + produto);
        var id =  UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;


    }

    @GetMapping("/{id}")// isso serve para vc mapear o parametro id.
    public produto obterPorId(@PathVariable("id") String id){ // pathvariable serve para reconhecer qual id seria usado

        return produtoRepository.findById(id).orElse(null);
    }
    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }
    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }
   @GetMapping
    public List<produto> buscar(@RequestParam("nome") String nome) {
       return produtoRepository.findByNome(nome);
   }
}
