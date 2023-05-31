/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ricar
 */
public class Borda {
    private String nome;
    private double valor;
    private Recheio recheio;

    public Borda(String nome, double valor, Recheio recheio) {
        this.nome = nome;
        this.valor = valor;
        this.recheio = recheio;
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
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the recheio
     */
    public Recheio getRecheio() {
        return recheio;
    }

    /**
     * @param recheio the recheio to set
     */
    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }
}