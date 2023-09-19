package br.senai.sp.jandira;

import java.util.Scanner;

public class Menu {
    Cliente refListCliente = new Cliente();
    Funcionario refListFuncionario = new Funcionario();
    Venda objVendas = new Venda();
    Veiculo refListVeiculo = new Veiculo();
    public void menu(){
        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;

        while(continuar){

            System.out.println("........................................");
            System.out.println(" ++++++ menu ++++++ ");
            System.out.println(" 1- Cadastro do Cliente: ");
            System.out.println(" 2- Cadastro do Veiculo: ");
            System.out.println(" 3- Cadastro do Funcionario: ");
            System.out.println(" 4- Realizar vendas: ");
            System.out.println(" 5- Listar Veiculos : ");
            System.out.println(" 6- Listar Clientes : ");
            System.out.println(" 7- Listar Funcionarios: ");
            System.out.println(" 8- Pesquisar Por Veiculos:  " );
            System.out.println(" 9- Sair: ");

            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            switch ( escolhaUsuario){

                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarClienter();
                    refListCliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.cadastrarVeiculos();
                    objVeiculo.adicionarVeiculos(objVeiculo);
                    refListVeiculo.adicionarVeiculos(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    refListFuncionario.adicionarFuncionarios(objFuncionario);
                    break;

                case 4:

                    boolean validaVenda = objVendas.realizarVenda(refListVeiculo, refListCliente);

                    if (validaVenda){
                        refListCliente.dinheiroDispostonivel -= refListVeiculo.preco;
                        System.out.println("O Saldo dp cliente é:   " + refListCliente.dinheiroDispostonivel);
                    }

                    break;

                case 5:
                   refListVeiculo.listarVeiculos();
                    break;

                case 6:
                    refListFuncionario.listarFuncionario();
                    break;

                case 7:
                    refListCliente.listarCliente();
                    break;

                case 8:
                    System.out.println("Informe o modelo do veiculo: ");
                    String veiculoPesquisado = teclado.nextLine();
                    boolean validaVeiculo = false;


                    if (veiculoPesquisado != null && veiculoPesquisado != "") {
                        validaVeiculo = refListVeiculo.pesquisarVeiculo(veiculoPesquisado);
                    }

                    if (validaVeiculo){
                        System.out.println("Veiculo Disponivel para Compra !!");
                    } else {
                        System.out.println("Veiculo Indisponivel !!");
                    }
                    break;
                case 9:
                   continuar = false;
                   break;
            }
            if (escolhaUsuario <1 || escolhaUsuario >5){
                System.out.println(" Escolha uma opção de 1 a 6");

            }
            if (escolhaUsuario <1 ||  escolhaUsuario >9 ){
                System.out.println(" Escolha uma opção valida   !!!");
            }

        }
    }

}
