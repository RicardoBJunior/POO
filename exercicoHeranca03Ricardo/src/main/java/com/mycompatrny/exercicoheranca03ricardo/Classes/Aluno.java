/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.exercicoheranca03ricardo.Classes;

/**
 *
 * @author ricar
 */
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public double tirarCopias(int numCopias) {
        return numCopias * 0.05;
    }
}
