/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.livraria.Livros;

/**
 *
 * @author ricar
 */
public class Livros extends Categoria {
    private String nome;
    private String autor;
    private Integer ano_pup;
    public Integer idLivro; 
    
    //Construtor Vazio
public Livros() {
    super();
	}

//Construtor com parâmetros
public Livros(String nome, String autor, Integer ano_pup, Integer idLivro){
    this.nome = nome;
    this.autor = autor;
    this.ano_pup = ano_pup;
    this.idLivro = idLivro;
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ano_pup
     */
    public Integer getAno_pup() {
        return ano_pup;
    }

    /**
     * @param ano_pup the ano_pup to set
     */
    public void setAno_pup(Integer ano_pup) {
        this.ano_pup = ano_pup;
    }

    /**
     * @return the idLivro
     */
    public Integer isIdLivro() {
        return idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }
    
 
    
    
}
