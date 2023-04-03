/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.lanchonetequasetreslanches;

/**
 *
 * @author ricar
 */
import Classes.Lanche;
import Classes.Pedido;
import Classes.Pizza;
import Classes.Prato;
import Classes.Salgadinho;
import java.util.ArrayList;
import java.util.Scanner;
public class LanchonetequasetresLanches {
static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<Prato> pratosDisponiveis = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Scanner nm = new Scanner(System.in);

    public static void main(String[] args) {
        carregarDados();

        int op = 0;

        while (true) {
            System.out.println("----Bem vindos ao Quase Três Lanches----\n");
            System.out.println("1) Fazer pedido\n2) sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    fazerPedido();
                    break;
                case 2:
                    return;
            }
        }
    }

    public static void carregarDados() {
        
        Pizza p1 = new Pizza("Tomate", "peperoni", "catupiry","Pizza de peperoni", 40.0, "08/4/2023", 40);
        Pizza p2 = new Pizza("Sem molho", "4 Queijos", "Catupiry", "Pizza de 5 queijos", 40.0, "08/4/2023", 40);
        Pizza p3 = new Pizza("Azeite", "Calabresa", "Sem borda", "Pizza de Calabresa", 40.0, "08/4/2023", 40);

        Lanche l1 = new Lanche("Brioche", "calabresa", "Catshup mostarda","Calabria", 13, "09/4/2023", 300);
        Lanche l2 = new Lanche("Francês", "Ovos e bacon", "Catupiry","Turbinado", 33, "09/4/2023", 400);
        Lanche l3 = new Lanche("Hamburger", "Frango catupiry", "Requeijão","Catupifrango", 20, "09/4/2023", 400);

        Salgadinho s1 = new Salgadinho("4 Queijos", "Batata","Bolete de Queijo", 5, "10/4/2023", 50);
        Salgadinho s2 = new Salgadinho("Calabresa", "Mandioca","Coxinha de calabresa", 6, "10/4/2023", 60);
        Salgadinho s3 = new Salgadinho("Carne moída", "Batata","Coxinha de carne moída" ,10, "10/4/2023", 70);
        
        //Pizzas
        pratosDisponiveis.add(p1);
        pratosDisponiveis.add(p2);
        pratosDisponiveis.add(p3);
        //Lanches
        pratosDisponiveis.add(l1);
        pratosDisponiveis.add(l2);
        pratosDisponiveis.add(l3);
        //Salgados
        pratosDisponiveis.add(s1);
        pratosDisponiveis.add(s2);
        pratosDisponiveis.add(s3);
        

     
        
   
 
    }

    public static void fazerPedido() {
        Pedido p = new Pedido();
        System.out.println("Nome do cliente: ");
        p.setNomeCliente(nm.nextLine());
        int op = -1;
        while (true) {
            for (int i = 0; i < pratosDisponiveis.size(); i ++){
                System.out.println(i + ")" + pratosDisponiveis.get(i).getNome());
            }
            System.out.println("Digite 9 para encerrar o pedido");
            op = sc.nextInt();
            if(op != 9 ){
                ArrayList<Prato> temp = new ArrayList<>();
                
                temp = p.getItensConsumidos();
                System.out.println(temp);
                temp.add(pratosDisponiveis.get(op));
                p.setItensConsumidos(temp);
            }else{
                break;
            }
        }
       
        p.imprimirNotaFiscal();
        
        
    }

}
 

