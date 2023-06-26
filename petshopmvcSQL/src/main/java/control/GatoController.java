package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.Gatos;
import view.CadastroCachorroView;
import view.CadastroGatoView;

public class GatoController {
	CadastroGatoView cadGatos;
	static List <Gatos> listaGatos = new ArrayList<Gatos>();
	
	public GatoController(CadastroGatoView cadGatos2){
	    cadGatos = cadGatos2;
	    cadGatos2.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Gatos gato = new Gatos();
    	  
	      boolean existeAnimal = CachorroController.existeCao(Integer.parseInt(cadGatos.getId()));
    	  if (!existeAnimal) {
    		  existeAnimal = existeGato(Integer.parseInt(cadGatos.getId()));
    		  if (!existeAnimal) {
    			  existeAnimal = PassaroController.existePassaro(Integer.parseInt(cadGatos.getId()));
    		  }
    	  }
    	  if (!existeAnimal) {
    		  gato.setId(Integer.parseInt(cadGatos.getId()));
	    	  gato.setNome(cadGatos.getName());
	    	  gato.setIdade(Integer.parseInt(cadGatos.getIdade()));
	    	  gato.setSexo(cadGatos.getSexo());
	    	  gato.setPorte(cadGatos.getPorte());
	    	  gato.setPeso(Double.parseDouble(cadGatos.getPeso()));
	    	  listaGatos.add(gato);
	    	  JOptionPane.showMessageDialog(null,"Gato cadastrado com sucesso!");
	      }else {
	    	  JOptionPane.showMessageDialog(null,"Já existe um animal cadastrado com esse Identificador!");
	      }
	    }
	  }  
	  
	  public static boolean existeGato(Integer id) {
		  for (Gatos c: listaGatos) {
			  if (c.getId().equals(id)){// verificando se o cachorro já está na lista		    	  
				  return true;
			  }
		  }
		  return false;
	  }

}
