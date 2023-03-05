/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.exercicoheranca03ricardo.Classes;

/**
 *
 * @author ricar
 */
public class Funcionario extends Pessoa {
    private double salario;
    private String dataAdmissao;
    private String cargo;

    public Funcionario(String nome, String cpf, String dataNascimento, double salario, String dataAdmissao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
