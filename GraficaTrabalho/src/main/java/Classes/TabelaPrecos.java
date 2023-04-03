/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ricar
 */
public class TabelaPrecos {
    private Map<ProdutoTipo, Double> precos;

    public TabelaPrecos() {
        this.precos = new HashMap<>();
    }

    public void definirPreco(ProdutoTipo tipo, double preco) {
        precos.put(tipo, preco);
    }

    public double obterPreco(ProdutoTipo tipo) {
        return precos.getOrDefault(tipo, 0.2);
    }
}
