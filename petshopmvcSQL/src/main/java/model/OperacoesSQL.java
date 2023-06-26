/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ricar
 */
public class OperacoesSQL {
     public static void main(String[] args) {
         if (ConexaoBanco.testarConexao()) {
            try {
                Connection connection = ConexaoBanco.getConnection();
                
                cadastrarProprietarios(connection);
                cadastrarAnimais(connection);
                associarAnimaisProprietarios(connection);
                gerarRelatorio(connection);
                
                ConexaoBanco.fecharConexao();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }
    
    
    private static void cadastrarProprietarios(Connection connection) throws SQLException {
        String insertProprietarioQuery = "INSERT INTO proprietarios (nome, cpf) VALUES (?, ?)";
        PreparedStatement insertProprietarioStmt = connection.prepareStatement(insertProprietarioQuery);
        
        // Cadastrar 4 proprietários
        insertProprietarioStmt.setString(1, "Proprietário 1");
        insertProprietarioStmt.setString(2, "111.111.111-11");
        insertProprietarioStmt.executeUpdate();
        
        // Repetir o processo para os outros proprietários...
    }
    
    private static void cadastrarAnimais(Connection connection) throws SQLException {
        String insertAnimalQuery = "INSERT INTO animais (nome, tipo) VALUES (?, ?)";
        PreparedStatement insertAnimalStmt = connection.prepareStatement(insertAnimalQuery);
        
        // Cadastrar 3 cães
        insertAnimalStmt.setString(1, "Cão 1");
        insertAnimalStmt.setString(2, "Cão");
        insertAnimalStmt.executeUpdate();
        
        // Repetir o processo para os outros cães...
        
        // Cadastrar 3 gatos
        insertAnimalStmt.setString(1, "Gato 1");
        insertAnimalStmt.setString(2, "Gato");
        insertAnimalStmt.executeUpdate();
        
        // Repetir o processo para os outros gatos...
        
        // Cadastrar 4 pássaros
        insertAnimalStmt.setString(1, "Pássaro 1");
        insertAnimalStmt.setString(2, "Pássaro");
        insertAnimalStmt.executeUpdate();
        
        // Repetir o processo para os outros pássaros...
    }
    
    private static void associarAnimaisProprietarios(Connection connection) throws SQLException {
        String insertAssociacaoQuery = "INSERT INTO proprietario_animal (id_proprietario, id_animal) VALUES (?, ?)";
        PreparedStatement insertAssociacaoStmt = connection.prepareStatement(insertAssociacaoQuery);
        
        // O proprietário 1 possui o cão 2, gato 3 e os pássaros 1 e 4
        insertAssociacaoStmt.setInt(1, 1); // Proprietário 1
        insertAssociacaoStmt.setInt(2, 2); // Cão 2
        insertAssociacaoStmt.executeUpdate();
        
        // Repetir o processo para as outras associações...
    }
    
    private static void gerarRelatorio(Connection connection) throws SQLException {
        String selectQuery = "SELECT p.nome AS nome_proprietario, a.nome AS nome_animal, a.tipo AS tipo_animal " +
                "FROM proprietarios p " +
                "JOIN proprietario_animal pa ON p.id = pa.id_proprietario " +
                "JOIN animais a ON a.id = pa.id_animal";
        PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
        ResultSet resultSet = selectStmt.executeQuery();
        
        while (resultSet.next()) {
            String nomeProprietario = resultSet.getString("nome_proprietario");
            String nomeAnimal = resultSet.getString("nome_animal");
            String tipoAnimal = resultSet.getString("tipo_animal");
            
            System.out.println("Nome do Proprietário: " + nomeProprietario);
            System.out.println("Nome do Animal: " + nomeAnimal);
            System.out.println("Tipo de Animal: " + tipoAnimal);
            System.out.println();
        }
        
        resultSet.close();
        selectStmt.close();
    }
}
