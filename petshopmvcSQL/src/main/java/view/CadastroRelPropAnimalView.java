package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroRelPropAnimalView extends JFrame {
	
		  JTextField cpf, id;
		  JButton botao;

	public CadastroRelPropAnimalView() {
		super("Relação de Animais e Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    JLabel cpfProprietario = new JLabel("Informe o CPF do Cliente");
	    cpf = new JTextField(10);
	    JLabel idAnimal = new JLabel("Informe o id do Animal");
	    id = new JTextField(40);
	    botao = new JButton("Cadastrar");
	    
	    
	    add(cpfProprietario);
	    add(cpf);
	    add(idAnimal);
	    add(id);
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
	public String getId() {
		return id.getText();
	}
	public void setId(JTextField id) {
		this.id = id;
	}
	
	
}
