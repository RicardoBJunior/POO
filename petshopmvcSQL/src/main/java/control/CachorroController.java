package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.Caes;
import view.CadastroCachorroView;

public class CachorroController {
	CadastroCachorroView cadCaes;
	static List <Caes> listaCaes = new ArrayList<Caes>();
	
	public CachorroController(CadastroCachorroView cadastroCachorro){
	    cadCaes = cadastroCachorro;
	    cadastroCachorro.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Caes cao = new Caes();
	      
	      boolean existeAnimal = existeCao(Integer.parseInt(cadCaes.getId()));
    	  if (!existeAnimal) {
    		  existeAnimal = GatoController.existeGato(Integer.parseInt(cadCaes.getId()));
    		  if (!existeAnimal) {
    			  existeAnimal = PassaroController.existePassaro(Integer.parseInt(cadCaes.getId()));
    		  }
    	  }
    	  if (!existeAnimal) {
    		  cao.setId(Integer.parseInt(cadCaes.getId()));
	    	  cao.setNome(cadCaes.getName());
	    	  cao.setIdade(Integer.parseInt(cadCaes.getIdade()));
	    	  cao.setSexo(cadCaes.getSexo());
	    	  cao.setPorte(cadCaes.getPorte());
	    	  cao.setPeso(Double.parseDouble(cadCaes.getPeso()));
	    	  listaCaes.add(cao);
	    	  JOptionPane.showMessageDialog(null,"Cachorro cadastrado com sucesso!");
	      }else {
	    	  JOptionPane.showMessageDialog(null,"Já existe um animal cadastrado com esse Identificador!");
	      }
	    }
	  }  
	  
	  public static boolean existeCao(Integer id) {
		  for (Caes c: listaCaes) {
			  if (c.getId().equals(id)){// verificando se o cachorro já está na lista
				  return true;
			  }
		  }
		  return false;
	  }

}
