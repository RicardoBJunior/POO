/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ricar
 */
public class Prato {
    String nome;
    double preco;
    Date dataDeValidade;
    double peso;

    public Prato() {
    }

    public Prato(String nome, double preco, Date dataDeValidade, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
@Override
 public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataDeValidade);

        return "Prato{" + "nome=" + nome + ", preco=" + preco + ", dataDeValidade=" + dataFormatada + ", peso=" + peso + '}';
    }

    
}