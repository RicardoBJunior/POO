/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.bancointerface;

import Classe.BancoA;
import Classe.BancoB;
import Classe.Conta;



/**
 *
 * @author ricar
 */
public class BancoInterface {

    public static void main(String[] args) {
        BancoA bancoA = new BancoA();
        BancoB bancoB = new BancoB();

        // Criando contas de exemplo
        Conta contaA = new Conta("01", 1000); //Banco A
        Conta contaB = new Conta("02", 500);  //Banco B

        // Adicionando as contas aos bancos
        bancoA.manutencaoConta(contaA);
        bancoB.manutencaoConta(contaB);

        // Realizando operações na conta do Banco A
        bancoA.extrato(contaA);
        bancoA.deposito(contaA, 500);
        bancoA.saque(contaA, 300);
        bancoA.extrato(contaA);

        // Realizando operações na conta do Banco B
        bancoB.extrato(contaB);
        bancoB.deposito(contaB, 200);
        bancoB.saque(contaB, 300);
        bancoB.extrato(contaB);
    }
}    
        
        
        
