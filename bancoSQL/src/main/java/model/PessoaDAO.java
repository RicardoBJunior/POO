/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class PessoaDAO {
private Connection connection = ConexaoBanco.getConnection();
	
	public List<Pessoa> getAllPessoas() {
		List<Pessoa> pessoas = new ArrayList<>();
		
		String query = "SELECT * FROM cadastro";
		
		try (Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery(query)) {
			
			while (resultSet.next()) {
				String CPF = resultSet.getString("CPF");
				String nome = resultSet.getString("nome");
				String endereco = resultSet.getString("endereco");
				String dataNascimento = resultSet.getString("datanascimento");
				
				Pessoa pessoa = new Pessoa(CPF, nome, endereco, dataNascimento);
				pessoas.add(pessoa);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pessoas;
	}
	
	public void insertPessoa(Pessoa pessoa) {
		String query = "INSERT INTO cadastro (CPF, nome, endereco, datanascimento) VALUES (?, ?, ?, ?)";
		
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, pessoa.getCpf());
			statement.setString(2, pessoa.getNome());
			statement.setString(3, pessoa.getEndereco());
			statement.setString(4, pessoa.getDataNascimento());
			
			int rowsAffected = statement.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Pessoa inserida com sucesso!");
			} else {
				System.out.println("Falha ao inserir pessoa.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updatePessoa(Pessoa pessoa) {
		String query = "UPDATE cadastro SET CPF = ?, nome = ? WHERE CPF = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, pessoa.getCpf());
			statement.setString(2, pessoa.getNome());
			statement.setString(3, pessoa.getCpf());
			
			int rowsAffected = statement.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Pessoa atualizada com sucesso!");
			} else {
				System.out.println("Falha ao atualizar pessoa.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletePessoa(String CPF) {
		String query = "DELETE FROM cadastro WHERE CPF = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, CPF);
			
			int rowsAffected = statement.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Pessoa removida com sucesso!");
			} else {
				System.out.println("Falha ao remover pessoa.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

    
}
