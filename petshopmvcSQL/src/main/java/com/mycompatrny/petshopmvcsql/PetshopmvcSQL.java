/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.petshopmvcsql;
import control.CachorroController;
import control.GatoController;
import control.PassaroController;
import control.ProprietarioController;
import control.RelPropAnimalController;
import view.CadastroCachorroView;
import view.CadastroGatoView;
import view.CadastroPassaroView;
import view.CadastroProprietarioView;
import view.CadastroRelPropAnimalView;

/**
 *
 * @author ricar
 */
public class PetshopmvcSQL {

   
public static void main(String[] args) {
		CadastroCachorroView cadCachorro = new CadastroCachorroView();
		new CachorroController(cadCachorro);
		CadastroGatoView cadGatos = new CadastroGatoView();
		new GatoController(cadGatos);
		CadastroPassaroView cadPassaros = new CadastroPassaroView();
		new PassaroController(cadPassaros);
		CadastroProprietarioView cadProprietario = new CadastroProprietarioView();
		new ProprietarioController(cadProprietario);
		CadastroRelPropAnimalView relCadProprietario = new CadastroRelPropAnimalView();
		new RelPropAnimalController(relCadProprietario);
	}
}
