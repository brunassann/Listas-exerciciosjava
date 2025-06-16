package lista_atividade2;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo(a) a Escambuna - escambo fácil e rápido!");
        System.out.println("--------------------------------------------------");

        System.out.println("Para começarmos, qual o valor atual da cotação do dólar (ex: 5.20)?");
        double dolar = entrada.nextDouble();

        System.out.println("Quantos dólares você tem disponível?");
        double quantidade = entrada.nextDouble();


        double conversao = dolar * quantidade;

        System.out.printf("Muito legal! No total você tem: R$ %.2f%n", conversao);

    }
}
