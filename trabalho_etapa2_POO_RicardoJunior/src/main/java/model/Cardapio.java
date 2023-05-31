/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author ricar
 */
public class Cardapio {
    
     private static ArrayList<Prato> pratosDisponiveis = new ArrayList<>();

    public static ArrayList<Prato> getPratosDisponiveis() {
        return pratosDisponiveis;
    }

    public static void adicionarPrato(Prato prato) {
        pratosDisponiveis.add(prato);
    }
}
    

