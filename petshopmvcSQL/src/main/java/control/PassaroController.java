package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.Passaros;
import view.CadastroCachorroView;
import view.CadastroPassaroView;

public class PassaroController {
	CadastroPassaroView cadPassaros;
	static List <Passaros> listaPassaros = new ArrayList<Passaros>();
	
	public PassaroController(CadastroPassaroView cadPassaros2){
	    cadPassaros = cadPassaros2;
	    cadPassaros2.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Passaros Passaro = new Passaros();
	      	          	  
	      boolean existeAnimal = CachorroController.existeCao(Integer.parseInt(cadPassaros.getId()));
    	  if (!existeAnimal) {
    		  existeAnimal = GatoController.existeGato(Integer.parseInt(cadPassaros.getId()));
    		  if (!existeAnimal) {
    			  existeAnimal = existePassaro(Integer.parseInt(cadPassaros.getId()));
    		  }
    	  }
    	  if (!existeAnimal) {
    		  Passaro.setId(Integer.parseInt(cadPassaros.getId()));
	    	  Passaro.setNome(cadPassaros.getName());
	    	  Passaro.setIdade(Integer.parseInt(cadPassaros.getIdade()));
	    	  Passaro.setSexo(cadPassaros.getSexo());
	    	  Passaro.setAnilha(Integer.parseInt(cadPassaros.getAnilha()));	    	  
	    	  listaPassaros.add(Passaro);
	    	  JOptionPane.showMessageDialog(null,"Passaro cadastrado com sucesso!");
	      }else {
	    	  JOptionPane.showMessageDialog(null,"Já existe um animal cadastrado com esse Identificador!");
	      }
	    }
	  }  
	  
	  public static boolean existePassaro(Integer id) {
		  for (Passaros c: listaPassaros) {
			  if (c.getId().equals(id)){// verificando se o cachorro já está na lista		    	  
				  return true;
			  }
		  }
		  return false;
	  }

}
