/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.trabalho_etapa3_poo_ricardojunior;

import conexao.ConexaoBanco;
import model.PratoLista;
import view.telaLogin;





/**
 *
 * @author ricar
 */
public class Trabalho_etapa3_POO_RicardoJunior {

    public static void main(String[] args) {
        ConexaoBanco.conectarBanco();
        telaLogin telalogin = new telaLogin();
        telalogin.setVisible(true);
        PratoLista carregarDados = new PratoLista();
   
    }
}
       
 

