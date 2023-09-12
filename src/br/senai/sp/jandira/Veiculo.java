package br.senai.sp.jandira;

import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, combustivel;

    double preco;

    int ano;
     /**  Instanciar Scanner */
     Scanner teclado = new Scanner(System.in);
    public void cadastrarVeiculos(){
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
}
