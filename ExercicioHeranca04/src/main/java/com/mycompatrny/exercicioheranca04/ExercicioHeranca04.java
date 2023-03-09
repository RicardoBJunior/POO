

package com.mycompatrny.exercicioheranca04;

import com.mycompatrny.exercicioheranca04.Classes.Animais;
import com.mycompatrny.exercicioheranca04.Classes.Caes;
import com.mycompatrny.exercicioheranca04.Classes.Gatos;
import com.mycompatrny.exercicioheranca04.Classes.Passaros;
import com.mycompatrny.exercicioheranca04.Classes.Proprietario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ricar
 */
public class ExercicioHeranca04 {

    public static void main(String[] args) {
      
Proprietario proprietario1 = new Proprietario("João da Silva");
Proprietario proprietario2 = new Proprietario("Maria Souza");

        Caes cao1 = new Caes("Max", 4, "Labrador", "Preto", "Macho", "Grande", 30.5);
        Caes cao2 = new Caes("Rick", 1, "Golden Retrier", "Dourado", "Macho", "Grande", 23.5);
        Gatos gato1 = new Gatos("Luna", 2, "Persa", "Branco", "Femea", "Pequeno", 5.0);
        Passaros passaro1 = new Passaros("Piu", 3, "Canário", "Amarelo", "Macho", "1234");
        Passaros passaro2 = new Passaros("Jovelino", 45, "Papagaio", "Verde", "Macho", "4312");

        proprietario1.adicionarAnimal(cao1);
        proprietario1.adicionarAnimal(cao2);
        proprietario2.adicionarAnimal(gato1);
        proprietario2.adicionarAnimal(passaro1);
        proprietario1.adicionarAnimal(passaro2);

        System.out.println("Animais do proprietário " + proprietario1.getNome() + ":");
        proprietario1.listarAnimais();

        System.out.println("Animais do proprietário " + proprietario2.getNome() + ":");
        proprietario2.listarAnimais();

        List<Proprietario> proprietarios = new ArrayList<>();
        proprietarios.add(proprietario1);
        proprietarios.add(proprietario2);

        System.out.println("Todos os animais e seus proprietários:");
//usado o Comparator para ordenar 
        List<Animais> animais = new ArrayList<>();
        for (Proprietario proprietario : proprietarios) {
            animais.addAll(proprietario.getAnimais());
        }

        Collections.sort(animais, Comparator.comparing(Animais::getIdade));

      for (Animais animal : animais) {
    if (animal.getPropietario() != null) {
        System.out.println(animal.getNome() + " (" + animal.getClass().getSimpleName() + ") - " +
                animal.getIdade() + " anos - Proprietario: " + animal.getPropietario().getNome());
}

    }
    }
}

        

