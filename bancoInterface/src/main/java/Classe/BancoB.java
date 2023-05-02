/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

import Bancos.Opbancos;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class BancoB implements Opbancos {
    private ArrayList<Conta> contas;
    private double limite = 500.0;

    public BancoB() {
        this.contas = new ArrayList<Conta>();
    }

    public void manutencaoConta(Conta conta) {
        contas.add(conta);
    }

    public boolean saque(Conta conta, double valor) {
        if (conta.getSaldo() - valor >= -limite) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public boolean deposito(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        return true;
    }

    public void extrato(Conta conta) {
        System.out.println("Extrato da conta " + conta.getNumero() + ":");
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

    @Override
    public int manutencaoConta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}