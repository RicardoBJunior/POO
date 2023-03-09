/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.exercicioheranca04.Classes;

/**
 *
 * @author ricar
 */
public class Passaros extends Animais {
    private String anilha;
    
public Passaros(String nome, int idade, String raca, String cor, String sexo, String anilha){
    super(nome,idade,raca,cor,sexo);
    this.anilha = anilha;
}

    /**
     * @return the anilha
     */
    public String getAnilha() {
        return anilha;
    }

    /**
     * @param anilha the anilha to set
     */
    public void setAnilha(String anilha) {
        this.anilha = anilha;
    }
    
}
