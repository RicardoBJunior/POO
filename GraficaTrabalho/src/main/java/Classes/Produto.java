/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ricar
 */
public class Produto {
    private ProdutoTipo tipo;
    private double preco;

    public Produto(ProdutoTipo tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public ProdutoTipo getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}
