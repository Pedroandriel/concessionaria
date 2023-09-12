package br.senai.sp.jandira;

import java.util.Scanner;

public class Cliente {
    /**
     *
     * Declarar Variaveis
     *
     */

    String nome, email, endereco;
     long telefone, cpf, rg;
     double dinheiroDispostonivel;
     /** Instanciar o Scanner */
     Scanner teclado = new Scanner(System.in);

     public void  cadastrarClienter(){
         System.out.println("------Cadastro Cliente-------");
         System.out.println("Informe o Seu nome : ");
         nome = teclado.nextLine();
         System.out.println("Digite seu CPF:  ");
         cpf = teclado.nextLong();
         System.out.println("Digite seu RG: ");
         rg =  teclado.nextLong();
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
         dinheiroDispostonivel =  teclado.nextDouble();
         System.out.println(" Cadastro Finalizado");
         System.out.println(" +++++++++++Obridado+++++++++++++++");

     }

}



