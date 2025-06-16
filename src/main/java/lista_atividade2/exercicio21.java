package lista_atividade2;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) a loja Mamão com açúcar! Produtos de qualidade para você!");
        System.out.println("Ficou sabendo da nossa super novidade! Estamos parcelando nossa compras em 5x sem juros!");
        System.out.println("Se interessou? Vem aqui saber em qual valor fica a sua prestação!");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Qual o valor da sua compra?");
        double valor = entrada.nextDouble();

        double prestacao = valor / 5;

        System.out.println("O valor das prestações fica assim:");
        System.out.printf("1° prestação: R$ %.2f%n", prestacao);
        System.out.printf("2° prestação: R$ %.2f%n", prestacao);
        System.out.printf("3° prestação: R$ %.2f%n", prestacao);
        System.out.printf("4° prestação: R$ %.2f%n", prestacao);
        System.out.printf("5° prestação: R$ %.2f%n", prestacao);
    }
}

