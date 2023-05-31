/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ricar
 */
public class Pagamento {
    private Pedido pedido;
    private String tipo;
    private double valorPagoDinheiro;

    public Pagamento(Pedido pedido, String tipo, double valorPagoDinheiro) {
        this.pedido = pedido;
        this.tipo = tipo;
        this.valorPagoDinheiro = valorPagoDinheiro;
    }

    public void gerarNotaFiscal() {
        // Implemente a geração da nota fiscal do pagamento
    }

    public void mostrarTroco(double valorPago) {
        // Implemente a exibição do troco do pagamento
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valorPagoDinheiro
     */
    public double getValorPagoDinheiro() {
        return valorPagoDinheiro;
    }

    /**
     * @param valorPagoDinheiro the valorPagoDinheiro to set
     */
    public void setValorPagoDinheiro(double valorPagoDinheiro) {
        this.valorPagoDinheiro = valorPagoDinheiro;
    }
}
