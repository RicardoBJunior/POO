/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.ex05herancaricardo;

import com.mycompatrny.ex05herancaricardo.Classe.Cliente;
import com.mycompatrny.ex05herancaricardo.Classe.Fornecedor;
import com.mycompatrny.ex05herancaricardo.Classe.Funcionario;
import com.mycompatrny.ex05herancaricardo.Classe.Produto;
import com.mycompatrny.ex05herancaricardo.Classe.Venda;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ricar
 */
public class Ex05HerancaRicardo {

    public static void main(String[] args) {
Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "1234567890", "fornecedor1@example.com", "Rua A, 123", LocalDate.now(), List.of("1111-1111", "2222-2222"));

Produto produto = new Produto(1, "Produto 1", 1000.0, fornecedor);

Produto produto2 = new Produto(2, "Produto 2", 500.0, fornecedor);

Funcionario vendedor = new Funcionario("Funcionário 1", "11111111111", "funcionario1@example.com", "Rua B, 456", LocalDate.now(), List.of("3333-3333"), LocalDate.now(), "Vendedor");

Funcionario vendedor2 = new Funcionario("Funcionário 2", "22222222222", "funcionario2@example.com", "Rua C, 400", LocalDate.now(), List.of("1111-2233"), LocalDate.now(), "Vendedor");

Cliente cliente = new Cliente("Cliente 1", "22222222222", "cliente1@exemplo.com", "Rua C, 789", LocalDate.now(), List.of("4444-4444"));

Cliente cliente2 = new Cliente("Cliente 2", "11111111111", "cliente2@exemplo.com", "Rua D, 140", LocalDate.now(), List.of("3333-4444"));

cliente.setDesconto(0.1); // 10% de desconto para clientes cadastrados
cliente2.setDesconto(0.1); 

vendedor.setDesconto(0.2); //20% de desconto para funcionario
vendedor2.setDesconto(0.2); 

        
Venda venda = new Venda(cliente, produto, fornecedor, vendedor);

Venda venda2 = new Venda(cliente2, produto, fornecedor, vendedor);

Venda venda3 = new Venda(cliente, produto2, fornecedor, vendedor2);

System.out.println("Venda para Cliente 1:");
System.out.println("Valor total: " + venda.getValorTotal());

System.out.println("Valor final: " + venda.getValorFinal());

System.out.println("Venda para Cliente 2:");
System.out.println("Valor total: " + venda2.getValorTotal());

System.out.println("Valor final: " + venda2.getValorFinal());


System.out.println("Venda para Cliente 3:");
System.out.println("Valor total: " + venda3.getValorTotal());

System.out.println("Valor final: " + venda3.getValorFinal());
}
}
    
        
    

