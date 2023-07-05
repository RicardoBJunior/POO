/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class Funcionario extends Pessoa {
    private String salario;
    private String cargo;

    public Funcionario(String codigo, String nome, String cpf, String endereco, ArrayList<String> telefones, String salario, String cargo) {
        super(codigo, nome, cpf, endereco, telefones);
        this.salario = salario;
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public String getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(String salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
