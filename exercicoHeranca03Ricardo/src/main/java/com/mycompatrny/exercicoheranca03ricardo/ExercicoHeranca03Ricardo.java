/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.exercicoheranca03ricardo;
import com.mycompatrny.exercicoheranca03ricardo.Classes.Aluno;
import com.mycompatrny.exercicoheranca03ricardo.Classes.Funcionario;
import com.mycompatrny.exercicoheranca03ricardo.Classes.Pessoa;
import com.mycompatrny.exercicoheranca03ricardo.Classes.Professor;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class ExercicoHeranca03Ricardo {

    public static void main(String[] args) {
        
        // Instaciando objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Carlos Silveira", "666.666.666-66", "02/05/2000");
        Pessoa pessoa2 = new Pessoa("Fernanda Martins", "333.333.333-33", "09/02/2000");
        
        // Imprimindo dados das Pessoas
        System.out.println("Dados das Pessoas:");
        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + ", CPF: " + pessoa1.getCpf() + ", Data de Nascimento: " + pessoa1.getDataNascimento());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + ", CPF: " + pessoa2.getCpf() + ", Data de Nascimento: " + pessoa2.getDataNascimento());
        
        
        // Imprimindo valor para 1000 cópias do professor
        System.out.println("Valor para 1000 cópias da Pessoa 1: R$" + pessoa1.tirarCopias(1000));
        System.out.println("Valor para 1000 cópias da Pessoa 2: R$" + pessoa1.tirarCopias(1000));
        
        // Instanciando objetos da classe Aluno
        Aluno aluno1 = new Aluno("João Silva", "111.111.111-11", "01/01/2000", "12345");
        Aluno aluno2 = new Aluno("Maria Santos", "222.222.222-22", "02/02/2001", "67890");

        // Imprimindo dados dos alunos
        System.out.println("Dados dos Alunos:");
        System.out.println("Aluno 1 - Nome: " + aluno1.getNome() + ", CPF: " + aluno1.getCpf() 
                + ", Data de Nascimento: " + aluno1.getDataNascimento() + ", Matrícula: " + aluno1.getMatricula());
        System.out.println("Aluno 2 - Nome: " + aluno2.getNome() + ", CPF: " + aluno2.getCpf() 
                + ", Data de Nascimento: " + aluno2.getDataNascimento() + ", Matrícula: " + aluno2.getMatricula());
        
        
        // Imprimindo valor para 1000 cópias de cada aluno
        System.out.println("Valor para 1000 cópias do Aluno 1: R$" + aluno1.tirarCopias(1000));
        System.out.println("Valor para 1000 cópias do Aluno 2: R$" + aluno2.tirarCopias(1000));
        
        // Instanciando objeto da classe Professor
        ArrayList<String> disciplinas = new ArrayList<String>();
        disciplinas.add("Matemática");
        disciplinas.add("Física");
        Professor professor1 = new Professor("José Santos", "333.333.333-33", "03/03/1970", 5000.0, disciplinas);
        
        // Imprimindo dados do professor
        System.out.println("\nDados do Professor:");
        System.out.println("Nome: " + professor1.getNome() + ", CPF: " + professor1.getCpf() + ", Data de Nascimento: " + professor1.getDataNascimento() + ", Salário: R$" + professor1.getSalario() + ", Disciplinas: " + professor1.getDisciplinas());

        // Imprimindo valor para 1000 cópias do professor
        System.out.println("Valor para 1000 cópias do Professor: R$" + professor1.tirarCopias(1000));
        
         // Instanciando objeto da classe Funcionário
        Funcionario funcionario1 = new Funcionario("Ana Oliveira", "444.444.444-44", "04/04/1990", 3000.0, "01/01/2010", "Secretária");
        
        
        // Imprimindo dados do funcionário
        System.out.println("\nDados do Funcionário:");
        System.out.println("Nome: " + funcionario1.getNome() + ", CPF: " + funcionario1.getCpf() + ", Data de Nascimento: " + funcionario1.getDataNascimento() + ", Salário: R$" + funcionario1.getSalario() + ", Data de Admissão: " + funcionario1.getDataAdmissao() + ", Cargo: " + funcionario1.getCargo());

        
        
        
        
        
        
        
        
        
        
    }
}
