/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

import Bancos.Opbancos;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ricar
 */
public class BancoA implements Opbancos {
    private Map<String, Conta> contas;

    public BancoA() {
        contas = new HashMap<>();
    }

    public void manutencaoConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    @Override
    public void extrato(Conta conta) {
        if (contas.containsKey(conta.getNumero())) {
            Conta contaAtual = contas.get(conta.getNumero());
            System.out.println("Extrato da conta " + contaAtual.getNumero());
            System.out.println("Saldo atual: " + contaAtual.getSaldo());
        }
    }

    @Override
    public boolean deposito(Conta conta, double valor) {
        if (contas.containsKey(conta.getNumero())) {
            Conta contaAtual = contas.get(conta.getNumero());
            contaAtual.setSaldo(contaAtual.getSaldo() + valor);
            return true;
        }
        return false;
    }

    @Override
    public boolean saque(Conta conta, double valor) {
        if (contas.containsKey(conta.getNumero())) {
            Conta contaAtual = contas.get(conta.getNumero());
            if (contaAtual.getSaldo() >= valor) {
                contaAtual.setSaldo(contaAtual.getSaldo() - valor);
                return true;
            }
        }
        return false;
    }

    public void transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contas.containsKey(contaOrigem.getNumero()) && contas.containsKey(contaDestino.getNumero())) {
            Conta contaAtualOrigem = contas.get(contaOrigem.getNumero());
            Conta contaAtualDestino = contas.get(contaDestino.getNumero());
            if (contaAtualOrigem.getSaldo() >= valor) {
                contaAtualOrigem.setSaldo(contaAtualOrigem.getSaldo() - valor);
                contaAtualDestino.setSaldo(contaAtualDestino.getSaldo() + valor);
            }
        }
    }

    @Override
    public int manutencaoConta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

