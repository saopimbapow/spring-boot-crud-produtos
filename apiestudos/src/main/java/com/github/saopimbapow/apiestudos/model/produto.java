package com.github.saopimbapow.apiestudos.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // serve para conseguir chamar as funçoes column e a table e conseguir colocar valor nas variaveis.
@Table(name = "produto")
public class produto {

    @Id // usei pq o id é a primary key do schema.sql, serve para dizer qual das privates é a primary key
    @Column(name = "id") // isso serve para quando no schema o nome da variavel estava diferente da private int aqui dentro da pasta
    private String id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private Double preco;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

   


}
