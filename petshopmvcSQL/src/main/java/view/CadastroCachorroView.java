package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroCachorroView extends JFrame {
	
		  JTextField id, nome, idade, raca, cor, sexo, porte, peso;
		  JButton botao;

	public CadastroCachorroView() {
		super("Cadastro de Cães");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel idCao = new JLabel("Informe o Identificador do Cão");
	    id = new JTextField(10);
	    JLabel nomeCao = new JLabel("Informe o Nome do Cão");
	    nome = new JTextField(40);
	    JLabel idadeCao = new JLabel("Informe a idade do Cão");
	    idade = new JTextField(60);
	    JLabel sexoCao = new JLabel("Informe o sexo do Cão");
	    sexo = new JTextField(20);
	    JLabel porteCao = new JLabel("Informe o porte do Cão");
	    porte = new JTextField(20);
	    JLabel pesoCao = new JLabel("Informe o peso do Cão");
	    peso = new JTextField(20);
	    botao = new JButton("Cadastrar");
	    
	    add(idCao);
	    add(id);
	    add(nomeCao);
	    add(nome);
	    add(idadeCao);
	    add(idade);
	    add(sexoCao);
	    add(sexo);
	    add(porteCao);
	    add(porte);
	    add(pesoCao);
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
