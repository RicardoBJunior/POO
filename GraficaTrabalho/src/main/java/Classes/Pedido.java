/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ricar
 */
public class Pedido {
    private Date dataEmissao;
    private Date dataFinalizacao;
    private double preco;
    private Funcionario responsavelVendas;
    private List<Produto> produtos;

    public Pedido(Date dataEmissao, Date dataFinalizacao, double preco, Funcionario responsavelVendas) {
        this.dataEmissao = dataEmissao;
        this.dataFinalizacao = dataFinalizacao;
        this.preco = preco;
        this.responsavelVendas = responsavelVendas;
        this.produtos = new ArrayList<>();
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public double getPreco() {
        return preco;
    }

    public Funcionario getResponsavelVendas() {
        return responsavelVendas;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    
}
