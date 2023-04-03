/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class Grafica {
    private List<Funcionario> funcionarios;
    private List<Pedido> pedidos;
    private TabelaPrecos tabelaPrecos;

    public Grafica() {
        this.funcionarios = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.tabelaPrecos = new TabelaPrecos();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> obterFuncionariosPorSetor(Setor setor) {
        List<Funcionario> result = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) { 
if (funcionario.getSetor() == setor) {
            result.add(funcionario);
        }
    }
    return result;
}

public void cadastrarPedido(Pedido pedido) {
    pedidos.add(pedido);
}

public List<Pedido> obterPedidosPorResponsavelVendas(Funcionario responsavel) {
    List<Pedido> result = new ArrayList<>();
    for (Pedido pedido : pedidos) {
        if (pedido.getResponsavelVendas() == responsavel) {
            result.add(pedido);
        }
    }
    return result;
}

public void definirPrecoProduto(ProdutoTipo tipo, double preco) {
    tabelaPrecos.definirPreco(tipo, preco);
}

public double obterPrecoProduto(ProdutoTipo tipo) {
    return tabelaPrecos.obterPreco(tipo);
}
}