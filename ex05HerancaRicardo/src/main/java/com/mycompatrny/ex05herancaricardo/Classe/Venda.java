/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.ex05herancaricardo.Classe;

/**
 *
 * @author ricar
 */
public class Venda {
private Cliente cliente;
private Produto produto;
private Fornecedor fornecedor;
private Funcionario vendedor;
private double valorTotal;
private double valorFinal;

public Venda(Cliente cliente, Produto produto, Fornecedor fornecedor, Funcionario vendedor) {
this.cliente = cliente;
this.produto = produto;
this.fornecedor = fornecedor;
this.vendedor = vendedor;
this.valorTotal = produto.getPrecoUnitario();

double descontoCliente = cliente.getDesconto();
if (descontoCliente == 0 && isNovoCliente()) {
descontoCliente = 0.05; // 5% de desconto para novos clientes
} else if (descontoCliente == 0) {
descontoCliente = 0.1; // 10% de desconto para clientes cadastrados
}
this.valorFinal = valorTotal * (1 - vendedor.getDesconto()) * (1 - descontoCliente);
}

private boolean isNovoCliente() {
//aqui era pra verificar se é um novo cliente
return true; 
}



    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the vendedor
     */
    public Funcionario getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the valorFinal
     */
    public double getValorFinal() {
        return valorFinal;
    }

    /**
     * @param valorFinal the valorFinal to set
     */
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
