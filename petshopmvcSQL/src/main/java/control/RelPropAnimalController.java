package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.RelPropAnimal;
import view.CadastroRelPropAnimalView;

public class RelPropAnimalController {
	CadastroRelPropAnimalView cadRelPropAnimals;
	static List <RelPropAnimal> listaRelPropAnimals = new ArrayList<RelPropAnimal>();
	
	public RelPropAnimalController(CadastroRelPropAnimalView cadRelPropAnimals2){
	    cadRelPropAnimals = cadRelPropAnimals2;
	    cadRelPropAnimals2.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      RelPropAnimal relPropAnimal = new RelPropAnimal();
	      
	      
    	  relPropAnimal.setCPF(cadRelPropAnimals.getCpf());
    	  relPropAnimal.setId(Integer.parseInt(cadRelPropAnimals.getId()));	 
    	  boolean existeProprietario = ProprietarioController.existeProprietario(relPropAnimal.getCPF());
    	  boolean existeAnimal = CachorroController.existeCao(relPropAnimal.getId());
    	  if (!existeAnimal) {
    		  existeAnimal = GatoController.existeGato(relPropAnimal.getId());
    		  if (!existeAnimal) {
    			  existeAnimal = PassaroController.existePassaro(relPropAnimal.getId());
    		  }
    	  }
    	  
    	  if (!existeProprietario && !existeAnimal) {
    		  JOptionPane.showMessageDialog(null,"Não existe Cliente e nem Animal Cadastrado!");
    	  }else if (!existeProprietario) {
    		  JOptionPane.showMessageDialog(null,"Não existe este cliente cadastrado!");
    	  }else if (!existeAnimal){
    		  JOptionPane.showMessageDialog(null,"Não existe este animal cadastrado!"); 
    	  }  
    	  
    	  if (existeProprietario && existeAnimal) {
	    	  if (!existeRelPropAnimal(listaRelPropAnimals, relPropAnimal)) {
		    	  listaRelPropAnimals.add(relPropAnimal);
		    	  JOptionPane.showMessageDialog(null,"Relação entre Cliente e Animal cadastrado com sucesso!");
		      }
    	  }
	    }
	  }  
	  
	  public boolean existeRelPropAnimal(List<RelPropAnimal> listaRelPropAnimals, RelPropAnimal relPropAnimal) {
		  for (RelPropAnimal c: listaRelPropAnimals) {
			  if (c.getCPF().equals(relPropAnimal.getCPF()) && c.getId().equals(relPropAnimal.getId())) {// verificando se o Relação já está na lista			  
		    	  JOptionPane.showMessageDialog(null,"Relação entre Cliente e Animal já está cadastrada!");
				  return true;
			  }
		  }
		  return false;
	  }

}
