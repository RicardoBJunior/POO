package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroGatoView extends JFrame {
	
		  JTextField id, nome, idade, raca, cor, sexo, porte, peso;
		  JButton botao;

	public CadastroGatoView() {
		super("Cadastro de Gatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idGatos = new JLabel("Informe o Identificador do Gato");
	    id = new JTextField(10);
	    JLabel nomeGatos = new JLabel("Informe o Nome do Gato");
	    nome = new JTextField(40);
	    JLabel idadeGatos = new JLabel("Informe a idade do Gato");
	    idade = new JTextField(60);
	    JLabel sexoGatos = new JLabel("Informe o sexo do Gato");
	    sexo = new JTextField(20);
	    JLabel porteGatos = new JLabel("Informe o porte do Gato");
	    porte = new JTextField(20);
	    JLabel pesoGatos = new JLabel("Informe o peso do Gato");
	    peso = new JTextField(20);
	    botao = new JButton("Cadastrar");
	    
	    add(idGatos);
	    add(id);
	    add(nomeGatos);
	    add(nome);
	    add(idadeGatos);
	    add(idade);
	    add(sexoGatos);
	    add(sexo);
	    add(porteGatos);
	    add(porte);
	    add(pesoGatos);
	    add(peso);
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
	public String getPorte() {
		return porte.getText();
	}
	public void setPorte(JTextField porte) {
		this.porte = porte;
	}
	public String getPeso() {
		return peso.getText();
	}
	public void setPeso(JTextField peso) {
		this.peso = peso;
	}
	public void setId(JTextField id) {
		this.id = id;
	}
	public void setNome(JTextField nome) {
		this.nome = nome;
	}
}
