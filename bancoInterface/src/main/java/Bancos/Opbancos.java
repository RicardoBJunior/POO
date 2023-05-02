/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bancos;

import Classe.Conta;

/**
 *
 * @author ricar
 */
public interface Opbancos {
    public int manutencaoConta();
    boolean saque(Conta conta, double valor);
    boolean deposito(Conta conta, double valor);
    void extrato(Conta conta);
}
