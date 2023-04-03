/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.graficatrabalho;

import Classes.Funcionario;
import Classes.FuncionarioTipo;
import Classes.Grafica;
import Classes.Pedido;
import Classes.Produto;
import Classes.ProdutoTipo;
import Classes.Setor;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ricar
 */
public class GraficaTrabalho {

    public static void main(String[] args) {
        Grafica grafica = new Grafica();
        
        Funcionario  gerenteFinanceiro = new Funcionario("João", FuncionarioTipo.GERENTE, Setor.FINANCEIRO, "Gerente financeiro");
        Funcionario gerenteProducao = new Funcionario("Maria", FuncionarioTipo.GERENTE, Setor.PRODUCAO, "Gerente de produção");
        Funcionario gerenteVendas = new Funcionario("Pedro", FuncionarioTipo.GERENTE, Setor.VENDAS, "Gerente de vendas");
        Funcionario empregado1 = new Funcionario("Carlos", FuncionarioTipo.EMPREGADO, Setor.PRODUCAO, "Operador de máquina");
        Funcionario empregado2 = new Funcionario("Ana", FuncionarioTipo.EMPREGADO, Setor.PRODUCAO, "Acabador");
        Funcionario terceirizado1 = new Funcionario("Marcos", FuncionarioTipo.TERCEIRIZADO, null, "Serviços gerais");
        Funcionario terceirizado2 = new Funcionario("Julia", FuncionarioTipo.TERCEIRIZADO, null, "Cozinheira");
        
        
    grafica.cadastrarFuncionario(gerenteFinanceiro);
    grafica.cadastrarFuncionario(gerenteProducao);
    grafica.cadastrarFuncionario(gerenteVendas);
    grafica.cadastrarFuncionario(empregado1);
    grafica.cadastrarFuncionario(empregado2);
    grafica.cadastrarFuncionario(terceirizado1);
    grafica.cadastrarFuncionario(terceirizado2);
        
        
        Pedido pedido1 = new Pedido(new Date(), new Date(), 1000.0, gerenteVendas);
        
        pedido1.adicionarProduto(new Produto(ProdutoTipo.BANNER, grafica.obterPrecoProduto(ProdutoTipo.BANNER)));
        pedido1.adicionarProduto(new Produto(ProdutoTipo.PANFLETO, grafica.obterPrecoProduto(ProdutoTipo.PANFLETO)));
        
        Pedido pedido2 = new Pedido(new Date(), new Date(), 2000.0, gerenteVendas);
    pedido2.adicionarProduto(new Produto(ProdutoTipo.LIVRO, grafica.obterPrecoProduto(ProdutoTipo.LIVRO)));
  
        
        grafica.cadastrarPedido(pedido1);
        grafica.cadastrarPedido(pedido2);
        
        List<Funcionario> funcionariosProducao = grafica.obterFuncionariosPorSetor(Setor.PRODUCAO);
        
        System.out.println("Funcionários da produção:");
    for (Funcionario funcionario : funcionariosProducao) {
        System.out.println(funcionario.getNome() + " - " + funcionario.getSetor());
}
        List<Pedido> pedidosResponsavelVendas = grafica.obterPedidosPorResponsavelVendas(gerenteVendas);
    System.out.println("Pedidos responsabilidade do gerente de vendas: " + gerenteVendas.getNome());
    for (Pedido pedido : pedidosResponsavelVendas) {
        System.out.println("Valor total do pedido: " + pedido.getPreco() );
    }
        
        
    grafica.definirPrecoProduto(ProdutoTipo.BANNER, 50.0);
    grafica.definirPrecoProduto(ProdutoTipo.LIVRO, 20.0);
    grafica.definirPrecoProduto(ProdutoTipo.PANFLETO, 10.0);

    System.out.println("Preço do banner: " + grafica.obterPrecoProduto(ProdutoTipo.BANNER));
    System.out.println("Preço do livro: " + grafica.obterPrecoProduto(ProdutoTipo.LIVRO));
    System.out.println("Preço do panfleto: " + grafica.obterPrecoProduto(ProdutoTipo.PANFLETO));
}
        
         
    }

