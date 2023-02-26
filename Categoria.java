/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.livraria.Livros;

/**
 *
 * @author ricar
 */
public class Categoria {
    private String nomeCategoria;
    public Integer idCategoria;
    
    
    
        //Construtor Vazio
public Categoria() {
    super();
	}

//Construtor com parâmetros
public Categoria(String nomeCategoria, Integer idCategoria){
    this.nomeCategoria = nomeCategoria;
    this.idCategoria = idCategoria;
  
}

    public Categoria(String fantasia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the nomeCategoria
     */
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    /**
     * @param nomeCategoria the nomeCategoria to set
     */
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    /**
     * @return the idCategoria
     */
    public Integer isIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}
