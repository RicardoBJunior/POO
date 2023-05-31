/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ricar
 */
public class Cliente extends Pessoa {
    private Date aniversario;

    public Cliente(String codigo, String nome, String cpf, String endereco, ArrayList<String> telefones, Date aniversario) {
        super(codigo, nome, cpf, endereco, telefones);
        this.aniversario = aniversario;
    }

    /**
     * @return the aniversario
     */
    public Date getAniversario() {
        return aniversario;
    }

    /**
     * @param aniversario the aniversario to set
     */
    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
}
