package br.senai.sp.jandira;

import java.util.Scanner;

public class Menu {
    Cliente objCliente = new Cliente();
    Funcionario objFuncionario = new Funcionario();
    Venda objVenda = new Venda();
    Veiculo objVeiculo = new Veiculo();
    public void menu(){
        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;

        while(continuar){

            System.out.println("........................................");
            System.out.println(" ++++++ menu ++++++ ");
            System.out.println(" 1- Cadastro do  Cliente: ");
            System.out.println(" 2- Cadastro do Veiculo: ");
            System.out.println(" 3- Cadastro do Funcionario: ");
            System.out.println(" 4- Realizar vendas: ");
            System.out.println(" 5- Sair: ");

            int escolhaUsuario = teclado.nextInt();

            switch ( escolhaUsuario){

                case 1:
                 objCliente.cadastrarClienter();
                    break;

                case 2:
                    objVeiculo.cadastrarVeiculos();
                    break;

                case 3:
                    objFuncionario.cadastrarFuncionario();
                    break;

                case 4:

                    boolean validaVenda = objVenda.realizarVenda(objVeiculo, objCliente);

                    if (validaVenda){
                        objCliente.dinheiroDispostonivel -= objVeiculo.preco;
                        System.out.println("O Saldo dp cliente é:   " + objCliente.dinheiroDispostonivel);
                    }

                    break;

                case 5:
                    continuar = false;
                    break;

            }
            if (escolhaUsuario <1 || escolhaUsuario >5){
                System.out.println(" Escolha uma opção de 1 a 5");

            }

        }






    }

}
