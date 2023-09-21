package br.senai.sp.jandira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    /**
     * Declarar Variaveis
     */

    public String nome, email, endereco;
    public long telefone, cpf, rg;
    public double dinheiroDispostonivel;
    /**
     * Instanciar o Scanner
     */
    Scanner teclado = new Scanner(System.in);
    List<Cliente> listClientes = new ArrayList<>();

    public void cadastrarClienter() {
        System.out.println("------Cadastro Cliente-------");
        System.out.println("Informe o Seu nome : ");
        nome = teclado.nextLine();
        System.out.println("Digite seu CPF:  ");
        cpf = teclado.nextLong();
        System.out.println("Digite seu RG: ");
        rg = teclado.nextLong();
        System.out.print("Informe seu Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextInt();
        System.out.println(" Informe o email:   ");
        email = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Informe seu Endereço: ");
        endereco = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Informe quanto você tem : ");
        dinheiroDispostonivel = teclado.nextDouble();
        System.out.println(" Cadastro Finalizado");
        System.out.println(" +++++++++++Obridado+++++++++++++++");

    }

    public void adicionarCliente(Cliente objCliente) {
        listClientes.add(objCliente);
    }

    public void listarCliente() {
        for (Cliente objCliente : listClientes) {
            System.out.println(objCliente.nome);
        }
    }
    public Cliente pesquisarComprador(String nomeComprador){

        for (Cliente cliente : listClientes) {
            if (cliente.nome.equalsIgnoreCase(nome)) {
             return cliente;
            }
        }
        return null;

    }

}
