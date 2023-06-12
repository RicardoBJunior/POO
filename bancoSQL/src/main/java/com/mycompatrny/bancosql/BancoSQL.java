/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.bancosql;

import conexao.ConexaoBanco;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import model.Pessoa;
import model.PessoaDAO;

/**
 *
 * @author ricar
 */
public class BancoSQL {

    public static void main(String[] args) throws SQLException {
       ConexaoBanco.conectarBanco();
		
		// Instanciar a classe PessoaDAO
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		// Tarefa a: Realizar o select * na base
		List<Pessoa> pessoasAntes = pessoaDAO.getAllPessoas();
		System.out.println("Resultado do select * na base:");
		for (Pessoa pessoa : pessoasAntes) {
			System.out.println("CPF: " + pessoa.getCpf() + ", Nome: " + pessoa.getNome() + ", Endereço: " + pessoa.getEndereco() + ", Data de Nascimento: " + pessoa.getDataNascimento());
		}
		
		// Tarefa b: Inserir 5 registros de pessoas na tabela cadastro
		 
        
                pessoaDAO.insertPessoa(new Pessoa("66666666666", "Carlos", "Rua Z", "03-02-1999"));
                pessoaDAO.insertPessoa(new Pessoa("11111111111", "Fulano", "Rua A", "25-12-2002"));
                pessoaDAO.insertPessoa(new Pessoa("22222222222", "Ciclano", "Rua B", "23-10-1991"));
                pessoaDAO.insertPessoa(new Pessoa("33333333333", "Beltrano", "Rua C", "01-01-1994"));
                pessoaDAO.insertPessoa(new Pessoa("44444444444", "Joao", "Rua D", "01-12-2003"));
                pessoaDAO.insertPessoa(new Pessoa("55555555555", "Maria", "Rua E", "15-06-2005"));
               
		
		
		// Tarefa c: Realizar o select * na base
		List<Pessoa> pessoasInseridas = pessoaDAO.getAllPessoas();
		System.out.println("Resultado do select * após inserção:");
		for (Pessoa pessoa : pessoasInseridas) {
			System.out.println("CPF: " + pessoa.getCpf() + ", Nome: " + pessoa.getNome() + ", Endereço: " + pessoa.getEndereco() + ", Data de Nascimento: " + pessoa.getDataNascimento());
		}
		
		// Tarefa d: Atualizar o 3º registro alterando o CPF para "1234567890" e o nome para "Beltrano"
		Pessoa pessoaAtualizar = pessoasInseridas.get(2);
		pessoaAtualizar.setCpf("1234567890");
		pessoaAtualizar.setNome("Beltrano");
		pessoaDAO.updatePessoa(pessoaAtualizar);
		
		// Tarefa e: Realizar o select * na base
		List<Pessoa> pessoasAtualizadas = pessoaDAO.getAllPessoas();
		System.out.println("Resultado do select * após atualização:");
		for (Pessoa pessoa : pessoasAtualizadas) {
			System.out.println("CPF: " + pessoa.getCpf() + ", Nome: " + pessoa.getNome() + ", Endereço: " + pessoa.getEndereco() + ", Data de Nascimento: " + pessoa.getDataNascimento());
		}
		
		//Tarefa f: Deletar 3 desses 5 registros
		pessoaDAO.deletePessoa(pessoasAtualizadas.get(0).getCpf());
		pessoaDAO.deletePessoa(pessoasAtualizadas.get(1).getCpf());
		pessoaDAO.deletePessoa(pessoasAtualizadas.get(2).getCpf());
		
		// Tarefa g: Realizar o select * na base
		List<Pessoa> pessoasDeletadas = pessoaDAO.getAllPessoas();
		System.out.println("Resultado do select * após deletar registros:");
		for (Pessoa pessoa : pessoasDeletadas) {
			System.out.println("CPF: " + pessoa.getCpf() + ", Nome: " + pessoa.getNome() + ", Endereço: " + pessoa.getEndereco() + ", Data de Nascimento: " + pessoa.getDataNascimento());
		}
		
		// Tarefa h: Deletar todos os registros
		for (Pessoa pessoa : pessoasDeletadas) {
			pessoaDAO.deletePessoa(pessoa.getCpf());
		}
                
		
		// Tarefa i: Realizar o select * na base
		List<Pessoa> pessoasVazias = pessoaDAO.getAllPessoas();
		System.out.println("Resultado do select * após deletar todos os registros:");
		for (Pessoa pessoa : pessoasVazias) {
			System.out.println("CPF: " + pessoa.getCpf() + ", Nome: " + pessoa.getNome() + ", Endereço: " + pessoa.getEndereco() + ", Data de Nascimento: " + pessoa.getDataNascimento());
		}
		
		ConexaoBanco.fecharConexao();
        
      

     
    }
        
    }

