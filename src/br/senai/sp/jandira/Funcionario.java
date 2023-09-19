package br.senai.sp.jandira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    /**
     * Declarar Variaveis
     *
     */

    String nome, email, endereco;
    long telefone, cpf, rg;
    double comissao;
    /**
     * Instanciar o Scanner
     */
    Scanner teclado = new Scanner(System.in);
    List<Funcionario> listFuncionarios = new ArrayList<>();


    public void cadastrarFuncionario() {
        System.out.println("------Cadastro Cliente-------");
        System.out.println("Qual é o nome do cliente: ");
        nome = teclado.nextLine();
        System.out.println("Digite seu CPF:  ");
        cpf = teclado.nextLong();
        System.out.println("Digite seu RG: ");
        rg = teclado.nextLong();
        System.out.println("Informe seu Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextInt();
        System.out.println(" Informe o email:   ");
        email = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Informe seu Endereço: ");
        endereco = teclado.nextLine();
        teclado.nextLine();
        System.out.println(" Cadastro Finalizado");
        System.out.println(" +++++++++++Obridado+++++++++++++++");

    }

    public void receberComissao(Veiculo objVeiculo){

        comissao += objVeiculo.preco * 0.10;
        System.out.println(" A comissao foi:  " + comissao);
    }

    public void adicionarFuncionarios(Funcionario objFuncionario){
        listFuncionarios.add(objFuncionario);
    }

    public void listarFuncionario(){
        for (Funcionario objFuncionario : listFuncionarios){
            System.out.println(objFuncionario.nome);
        }
    }

}
