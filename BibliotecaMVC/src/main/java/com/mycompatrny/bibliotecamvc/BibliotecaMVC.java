/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.bibliotecamvc;

/**
 *
 * @author ricar
 */
import Classes.Categoria;
import Classes.Livro;
import Classes.LivroCategoria;
import Classes.Tela;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaMVC {
   
    
	public static void main (String [] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
                
              
		
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		Livro livro1 = new Livro(1, "Livro 1", "Ciclano", formato.parse("01/01/1990"));
		Livro livro2 = new Livro(2, "Livro 2", "Ciclano", formato.parse("01/01/1994"));
		Livro livro3 = new Livro(3, "Livro 3", "Beltrano", formato.parse("01/01/1998"));
		Livro livro4 = new Livro(4, "Livro 4", "Beltrano", formato.parse("01/01/1999"));
		Livro livro5 = new Livro(5, "Livro 5", "Fulano", formato.parse("01/01/1995"));
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);

		
		
		
		List<Categoria> listaCategoria = new ArrayList<Categoria>();

		Categoria categoria1 = new Categoria(1, "Fantasia");
		Categoria categoria2 = new Categoria(2, "Aeromodelismo");
		listaCategoria.add(categoria1);
		listaCategoria.add(categoria2);


		
		
		List<LivroCategoria> listaLivrosCategoria = new ArrayList<LivroCategoria>();
		
		LivroCategoria livroCategoria = new LivroCategoria(1, 1);
		listaLivrosCategoria.add(livroCategoria);
		livroCategoria = new LivroCategoria(2, 2);
		listaLivrosCategoria.add(livroCategoria);
		livroCategoria = new LivroCategoria(3, 1);
		listaLivrosCategoria.add(livroCategoria);
		livroCategoria = new LivroCategoria(4, 2);
		listaLivrosCategoria.add(livroCategoria);
		livroCategoria = new LivroCategoria(5, 2);
		listaLivrosCategoria.add(livroCategoria);
           
    //Unica forma que funcionou foi utilizando a classe StringBuilder 
    StringBuilder sb = new StringBuilder();
    for (Livro l : listaLivros) {
        for (LivroCategoria lc : listaLivrosCategoria) {
            if (l.getIdLivro() == lc.getIdLivro()) {
                for (Categoria c : listaCategoria) {
                    if (c.getIdCategoria() == lc.getIdCategoria()) {
                        sb.append("Livro: " + l.getNome() + " - Categoria: " + c.getNome() + "\n");
                        break;
                    }
                }
            }
        }
    }

    Tela minhaTela = new Tela();
    minhaTela.mostrarResultado(sb.toString());
    minhaTela.setVisible(true);
}

    
        }
            
                
		


	


