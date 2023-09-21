package br.senai.sp.jandira;

import java.util.Scanner;

public class Menu {
    Cliente refListCliente = new Cliente();
    Funcionario refListFuncionario = new Funcionario();
    Venda objVenda = new Venda();
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
            System.out.println(" 9- Pagamento a Vista ou financiado? : ");
            System.out.println(" 10- Sair!");

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
                    refListVeiculo.adicionarVeiculos(objVeiculo);
                    refListVeiculo.adicionarVeiculos(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    refListFuncionario.adicionarFuncionarios(objFuncionario);
                    break;

                case 4:

                    refListCliente.listarCliente();
                    System.out.println(" Informe o nome do cliente:  ");
                    String nomeComprador = teclado.nextLine();

                    refListVeiculo.listarVeiculos();
                    System.out.println(" Informe o modelo do Veiculo: ");
                    String modeloVeiculo = teclado.nextLine();

                    refListFuncionario.listarFuncionario();
                    System.out.println(" Informe o nome do vendedor:  ");
                    String nomeVendedor = teclado.nextLine();

                    Cliente objComprador = refListCliente.pesquisarComprador(nomeComprador);
                     Veiculo objVeiculoVenda = refListVeiculo.localizarVeiculo(modeloVeiculo);
                     Funcionario objVendedor = refListFuncionario.pesquisarVendedor(nomeVendedor);

                     boolean formaPagamento = objVenda.avaliaFormaPagamento();


                     boolean validaVenda = false;
                     boolean validaFinanciamento = false;

                     if(formaPagamento){
                         validaVenda = objVenda.realizarVenda(objVeiculoVenda, objComprador);
                     }else{
                         validaFinanciamento= objVenda.realizarFinanciamento(objComprador, objVeiculoVenda);
                     }



                    boolean validaVnda = objVenda.realizarVenda(refListVeiculo, refListCliente);

                    if (validaVenda || validaFinanciamento){
                        System.out.println("////// ------- Parabens ------/////");
                        objComprador.dinheiroDispostonivel -= objVeiculoVenda.preco;
                        System.out.println("O Saldo do cliente é:   " + objComprador.dinheiroDispostonivel);

                        objVendedor.receberComissao(objVeiculoVenda);
                        System.out.println("O Funcionario recebeu:  " + objVendedor.comissao);
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
            if (escolhaUsuario <1 || escolhaUsuario >9) {
                System.out.println(" Escolha uma opção de 1 a 6");

            }
        }
    }

}
