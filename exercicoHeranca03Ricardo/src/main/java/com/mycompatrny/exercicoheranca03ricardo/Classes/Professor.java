/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.exercicoheranca03ricardo.Classes;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class Professor extends Pessoa {
    private double salario;
    private ArrayList<String> disciplinas;

    public Professor(String nome, String cpf, String dataNascimento, double salario, ArrayList<String> disciplinas) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public double tirarCopias(int numCopias) {
        return numCopias * 0.10;
    }
}
