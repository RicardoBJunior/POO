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
public class Fornecedor {
private String nome;
private String cnpj;
private String email;
private String endereco;
private LocalDate dataAbertura;
private List<String> telefones;

public Fornecedor(String nome, String cnpj, String email, String endereco, LocalDate dataAbertura, List<String> telefones) {
this.nome = nome;
this.cnpj = cnpj;
this.email = email;
this.endereco = endereco;
this.dataAbertura = dataAbertura;
this.telefones = telefones;
}

// getters e setters

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
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
     * @return the dataAbertura
     */
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
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
}
