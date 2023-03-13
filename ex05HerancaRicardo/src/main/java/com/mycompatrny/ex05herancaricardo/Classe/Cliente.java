/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.ex05herancaricardo.Classe;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ricar
 */
public class Cliente {
private String nome;
private String cpf;
private String email;
private String endereco;
private LocalDate dataNascimento;
private List<String> telefones;
private double desconto;

public Cliente(String nome, String cpf, String email, String endereco, LocalDate dataNascimento, List<String> telefones) {
this.nome = nome;
this.cpf = cpf;
this.email = email;
this.endereco = endereco;
this.dataNascimento = dataNascimento;
this.telefones = telefones;
this.desconto = 0;
}

public void setDesconto(double desconto) {
this.desconto = desconto;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the telefones
     */
    public List<String> getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }
}
