/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.exercicioheranca04.Classes;

import java.util.ArrayList;
import java.util.List;
import com.mycompatrny.exercicioheranca04.Classes.Animais;

/**
 *
 * @author ricar
 */
public class Proprietario {
 private String nome;
    private List<Animais> animais;

    public Proprietario(String nome) {
        this.nome = nome;
        animais = new ArrayList<>();
    }

 

    public List<Animais> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animais animal) {
        animais.add(animal);
        animal.setPropietario(this);
    }

    public void listarAnimais() {
        for (Animais animal : animais) {
            System.out.println(animal.getNome() + " (" + animal.getClass().getSimpleName() + ") - " +
                    animal.getIdade() + " anos");
        }
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
}
