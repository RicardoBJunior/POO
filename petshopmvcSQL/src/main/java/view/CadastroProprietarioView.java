package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroProprietarioView extends JFrame {
	
		  JTextField cpf, nome, endereco, telefone;
		  JButton botao;

	public CadastroProprietarioView() {
		super("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel cpfProprietario = new JLabel("Informe o CPF do Cliente");
	    cpf = new JTextField(10);
	    JLabel nomeProprietario = new JLabel("Informe o Nome do Cliente");
	    nome = new JTextField(40);
	    JLabel enderecoProprietario = new JLabel("Informe a endereço do Cliente");
	    endereco = new JTextField(60);
	    JLabel telefoneProprietario = new JLabel("Informe o telefone do Cliente");
	    telefone = new JTextField(20);
	    botao = new JButton("Cadastrar");
	    
	    add(cpfProprietario);
	    add(cpf);
	    add(nomeProprietario);
	    add(nome);
	    add(enderecoProprietario);
	    add(endereco);
	    add(telefoneProprietario);
	    add(telefone);
	    add(botao);
	    
	    pack();
	    
	    setVisible(true);
	}
	 public void setBotaoBehavior(ActionListener botaoBehavior){
		 botao.addActionListener(botaoBehavior);
	  }
	public String getCpf() {
		return cpf.getText();
	}
	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome.getText();
	}
	public void setNome(JTextField nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco.getText();
	}
	public void setEndereco(JTextField endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone.getText();
	}
	public void setTelefone(JTextField telefone) {
		this.telefone = telefone;
	}
	
}
