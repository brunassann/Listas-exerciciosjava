package lista_atividade2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo a Brunis Calçados!");
        System.out.println("É um prazer ter você aqui com a gente!");
        System.out.println("Vamos ver quanto que você vendeu esse mês?");
        System.out.println("--------------------------------------------------");

        System.out.println("Mas para começar, qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println(nome + " qual o seu salário fixo?");
        double salario = entrada.nextDouble();

        System.out.println(nome + " quantas vendas você realizou esse mês em dinheiro? (R$)");
        double vendas = entrada.nextInt();

        double comissao = vendas * 0.15;
        double salarioFinal = salario + comissao;


        System.out.println("-----------------------------------------------------");
        System.out.println("------------- RELÁTORIO DO VENDEDOR------------------");
        System.out.println("Funcionário: " + nome);
        System.out.printf("Sálario: R$ %.2f%n", salario);
        System.out.printf("Vendas: R$ %.2f%n", vendas);
        System.out.printf("Comissao: R$ %.2f%n", comissao);
        System.out.println("------------------------------");
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

    }
}
