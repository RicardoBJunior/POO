package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Cardapio;
import model.Pedido;
import model.Prato;


public class telaCardapio {
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<Prato> pratosDisponiveis = new ArrayList<>();

    public static void main(String[] args) {
        

        JFrame frame = new JFrame("Quase Três Lanches");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel label = new JLabel("----Bem vindos ao Quase Três Lanches----");
        panel.add(label);

        JButton fazerPedidoButton = new JButton("Fazer pedido");
        fazerPedidoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fazerPedido();
            }
        });
        panel.add(fazerPedidoButton);

        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(sairButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }



public static void fazerPedido() {
        Pedido p = new Pedido();
        String nomeCliente = JOptionPane.showInputDialog(null, "Nome do cliente:");
        p.setNomeCliente(nomeCliente);

        ArrayList<Prato> pratosDisponiveis = Cardapio.getPratosDisponiveis();
        String[] options = new String[pratosDisponiveis.size() + 1];
        for (int i = 0; i < pratosDisponiveis.size(); i++) {
            options[i] = pratosDisponiveis.get(i).getNome();
        }
        options[pratosDisponiveis.size()] = "Encerrar o pedido";

        while (true) {
            int op = JOptionPane.showOptionDialog(null, "Escolha um prato:", "Fazer pedido",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (op != pratosDisponiveis.size()) {
                ArrayList<Prato> temp = p.getItensConsumidos();
                temp.add(pratosDisponiveis.get(op));
                p.setItensConsumidos(temp);
            } else {
                break;
            }
        }

        pedidos.add(p);
        p.imprimirNotaFiscal();
    }





}
       
