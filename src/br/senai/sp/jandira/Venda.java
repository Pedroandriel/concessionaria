
package br.senai.sp.jandira;

import java.util.Scanner;

 public class Venda {
     Scanner teclado = new Scanner(System.in);

     public boolean realizarVenda(Veiculo objVeiculo, Cliente objCliente) {
         if (objCliente.dinheiroDispostonivel >= objVeiculo.preco) {

             System.out.println(" ------------- Parabens --------------");
             System.out.println("Olá :" + objCliente.nome);
             System.out.println("Você acaba de adquirir um :  " + objVeiculo.modelo);
             System.out.println("-------------------------------------------------");
             return true;

         } else {
             System.out.println(" EScolha um veiculo mais compativel com sua realidade");
             return false;

         }

     }

     public boolean avaliaFormaPagamento() {
         System.out.println("/////////Informe como deseja pagar///////");
         System.out.println("1- avista : ");
         System.out.println("2- financiamento :  ");

         int formaPagamento = teclado.nextInt();
         teclado.nextLine();

         if (formaPagamento == 1) {
             return true;
         } else {
             return false;
         }
     }

     public boolean realizarFinanciamento(Cliente cliente, Veiculo veiculo) {

         System.out.println("// ******* Financiamento ****** //");

         System.out.println("Informe o  Valor da Entrada");
         double valorEntrada = teclado.nextDouble();

         System.out.println("Infome quantas parcelas:  ");
         int parcelas = teclado.nextInt();
         teclado.nextLine();

         if (valorEntrada <= cliente.dinheiroDispostonivel && valorEntrada > 0){

             double valorFinanciado = veiculo.preco - valorEntrada;

             double valorParcelas = valorFinanciado / parcelas;
             System.out.println(" O valor das parcelas será de" + valorParcelas);
             return true;
         }
         return false;
     }

 }
