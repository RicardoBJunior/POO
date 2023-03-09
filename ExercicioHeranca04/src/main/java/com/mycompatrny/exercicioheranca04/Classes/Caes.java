/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.exercicioheranca04.Classes;

/**
 *
 * @author ricar
 */
public class Caes extends Animais {
    private String porte;
    private double peso;
    
public Caes(String nome, int idade, String raca, String cor,String sexo, String porte, double peso){
    super(nome,idade,raca,cor,sexo);
    this.porte = porte;
    this.peso = peso;
}

    /**
     * @return the porte
     */
    public String getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(String porte) {
        this.porte = porte;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
