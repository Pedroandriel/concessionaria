package br.senai.sp.jandira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, combustivel;

    double preco;

    int ano;
    boolean disponivel;
    /**
     * Instanciar Scanner
     */
    Scanner teclado = new Scanner(System.in);
    List<Veiculo> litVeiculos = new ArrayList();

    public void cadastrarVeiculos() {
        System.out.println("----Cadastro Veiculo------");
        System.out.println("Informe a Marca:  ");
        marca = teclado.nextLine();
        System.out.println("Informe o Modelo:  ");
        modelo = teclado.nextLine();
        System.out.println("Informe a Cor : ");
        cor = teclado.nextLine();
        System.out.println("Informe a Placa: ");
        placa = teclado.nextLine();
        System.out.println("Informe o Combustivel: ");
        combustivel = teclado.nextLine();
        System.out.println("Informe o Preço:  ");
        preco = teclado.nextDouble();

    }

    public void adicionarVeiculos(Veiculo objVeiculo) {
        litVeiculos.add(objVeiculo);
    }
    public void listarVeiculos() {
        for (Veiculo objVeiculo : litVeiculos) {
            System.out.println(objVeiculo.modelo);
        }
    }
    public boolean pesquisarVeiculo(String veiculoPesquisado){
        for (Veiculo objVeiculo : litVeiculos){
            if (objVeiculo.modelo.equalsIgnoreCase(veiculoPesquisado)){
                return true;
            }
        }
        return false;
    }
    void vender(Cliente cliente,  Venda venda) {






    }
}
