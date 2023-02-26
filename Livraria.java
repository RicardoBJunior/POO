

package com.mycompatrny.livraria;

import com.mycompatrny.livraria.Livros.Categoria;
import com.mycompatrny.livraria.Livros.Livros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class Livraria extends Livros {

    public static void main(String[] args) {
        //categorias
        Categoria categ01 = new Categoria("Fantasia",550);
        
        Categoria categ02 = new Categoria("Mitologia Grega",440);
        
        Categoria categ03 = new Categoria("Auto Ajuda",800);
        
        Categoria categ04 = new Categoria("Ficcao Historica",120);
        
        //inserindo os 10 livros
        //fantasia, mitologia grega, auto ajuda, ficcao historica 
        Livros livro01 = new Livros("Harry Potter e a Pedra Filosofal","J. K. Rowling",1997,550);
        
        Livros livro02 = new Livros("Harry Potter e a Câmara Secreta","J. K. Rowling",1998,550);
        
        Livros livro03 = new Livros("Harry Potter e o Prisioneiro de Azkaban","J. K. Rowling",1999,550);
        
        Livros livro04 = new Livros("Harry Potter e o Cálice de Fogo","J. K. Rowling",2000,550);
        
        Livros livro05 = new Livros("O Segredo","Rhonda Byrne",2006,800);
        
        Livros livro06 = new Livros("O Ladrão de Raios","Rick Riordan",2005,440);
        
        Livros livro07 = new Livros("O Mar de Monstros","Rick Riordan",2006,440);
        
        Livros livro08 = new Livros("A Maldição do Titã","Rick Riordan",2007,440);
        
        Livros livro09 = new Livros("O Último Olimpiano","Rick Riordan",2009,440);
        
        Livros livro10 = new Livros("Renascença - Assassins Creed","Anton Gill",2009,120);
        
        
        
        System.out.println("Nome do Livro: " +livro01.getNome() + " Categoria: " + categ01.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro02.getNome() + " Categoria: " + categ01.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro03.getNome() + " Categoria: " + categ01.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro04.getNome() + " Categoria: " + categ01.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro05.getNome() + " Categoria: " + categ03.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro06.getNome() + " Categoria: " + categ02.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro07.getNome() + " Categoria: " + categ02.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro08.getNome() + " Categoria: " + categ02.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro09.getNome() + " Categoria: " + categ02.getNomeCategoria());
        
        System.out.println("Nome do Livro: " +livro10.getNome() + " Categoria: " + categ04.getNomeCategoria());
        
        
      
        
     
        
        /*List<Livros> livros = new ArrayList<Livros>();
        livros.add(livro01);
        livros.add(livro02);
        livros.add(livro03);
        livros.add(livro04);
        livros.add(livro05);
        livros.add(livro06);
        livros.add(livro07);
        livros.add(livro08);
        livros.add(livro09);
        livros.add(livro10);*/
    }
}
