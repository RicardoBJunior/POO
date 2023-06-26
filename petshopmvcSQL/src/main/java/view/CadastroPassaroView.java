package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroPassaroView extends JFrame {
	
		  JTextField id, nome, idade, raca, cor, sexo, anilha;
		  JButton botao;

	public CadastroPassaroView() {
		super("Cadastro de Pássaros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idPassaros = new JLabel("Informe o Identificador do Pássaro");
	    id = new JTextField(10);
	    JLabel nomePassaros = new JLabel("Informe o Nome do Pássaro");
	    nome = new JTextField(40);
	    JLabel idadePassaros = new JLabel("Informe a idade do Pássaro");
	    idade = new JTextField(60);
	    JLabel sexoPassaros = new JLabel("Informe o sexo do Pássaro");
	    sexo = new JTextField(20);
	    JLabel anilhaPassaro = new JLabel("Informe a anilha do Pássaro");
	    anilha = new JTextField(20);
	    botao = new JButton("Cadastrar");
	    
	    add(idPassaros);
	    add(id);
	    add(nomePassaros);
	    add(nome);
	    add(idadePassaros);
	    add(idade);
	    add(sexoPassaros);
	    add(sexo);
	    add(anilhaPassaro);
	    add(anilha);
	    add(botao);
	    
	    pack();
	    
	    setVisible(true);
	}
	 public void setBotaoBehavior(ActionListener botaoBehavior){
		 botao.addActionListener(botaoBehavior);
	  }
	public String getId() {
		return id.getText();
	}
	
	public String getNome() {
		return nome.getText();
	}
	public String getIdade() {
		return idade.getText();
	}
	public void setIdade(JTextField idade) {
		this.idade = idade;
	}
	public JTextField getRaca() {
		return raca;
	}
	public void setRaca(JTextField raca) {
		this.raca = raca;
	}
	public JTextField getCor() {
		return cor;
	}
	public void setCor(JTextField cor) {
		this.cor = cor;
	}
	public String getSexo() {
		return sexo.getText();
	}
	public void setSexo(JTextField sexo) {
		this.sexo = sexo;
	}
	
	public String getAnilha() {
		return anilha.getText();
	}
	public void setAnilha(JTextField anilha) {
		this.anilha = anilha;
	}
	public void setId(JTextField id) {
		this.id = id;
	}
	public void setNome(JTextField nome) {
		this.nome = nome;
	}
}
