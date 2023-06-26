package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Proprietario;
import view.CadastroProprietarioView;

public class ProprietarioController {
	CadastroProprietarioView cadProprietarios;
	static List <Proprietario> listaProprietarios = new ArrayList<Proprietario>();
	
	public ProprietarioController(CadastroProprietarioView cadProprietarios2){
	    cadProprietarios = cadProprietarios2;
	    cadProprietarios2.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Proprietario proprietario = new Proprietario();	      	      
    	  
    	  if (!existeProprietario(cadProprietarios.getCpf())) {
    		  proprietario.setCPF(cadProprietarios.getCpf());
	    	  proprietario.setNome(cadProprietarios.getName());
	    	  proprietario.setEndereco(cadProprietarios.getEndereco());
	    	  proprietario.setTelefone(cadProprietarios.getTelefone());
	    	  listaProprietarios.add(proprietario);
	    	  JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
	      }else {
	    	  JOptionPane.showMessageDialog(null,"Este Cliente já está cadastrado!");
	      }
	    }
	  }  
	  
	  public static boolean existeProprietario(String cpf) {
		  for (Proprietario c: listaProprietarios) {
			  if (c.getCPF().equals(cpf)) {// verificando se o proprietário já está na lista			  		    	  
				  return true;
			  }
		  }
		  return false;
	  }
}
