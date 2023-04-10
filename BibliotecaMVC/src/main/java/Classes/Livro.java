/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ricar
 */
import java.util.Date;

public class Livro {
	
	private int idLivro;
	private String nome;
	private String autor;
	private Date ano_publicacao;
	
	public Livro(int idLivro, String nome, String autor, Date ano_publicacao) {
		super();
		this.idLivro = idLivro;
		this.nome = nome;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}	
}
