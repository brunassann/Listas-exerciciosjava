package lista_atividade2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //apresentação - escolha do prato
        System.out.println("Olá, seja bem vindo ao Cantinho da Bruna com as melhores refeições de São Paulo");
        System.out.println("Para começar, selecione o prato que deseja:");
        System.out.println("1-vegetariano | 2-peixe | 3-frango | 4-carne");
        int prato_principal = entrada.nextInt();

        // escolha bebida
        System.out.println("Ótima escolha, agora selecione uma bebida");
        System.out.println("1-chá | 2-suco de laranja | 3-suco de melão | 4-refrigerante diet");
        int bebida = entrada.nextInt();

        System.out.println("E para finalizar escolha uma sobremesa");
        System.out.println("1-abacaxi | 2-sorvete diet | 3-mouse diet | 4-mouse chocolate");
        int sobremesa = entrada.nextInt();

        int caloriasPrato = 0;
        int caloriasBebida = 0;
        int caloriasSobremesa = 0;

        switch (prato_principal) {
            case 1: caloriasPrato = 180; break;
            case 2: caloriasPrato = 230; break;
            case 3: caloriasPrato = 250; break;
            case 4: caloriasPrato = 350; break;
            default:
                System.out.println("Opção invalida!");
        }

        switch (bebida) {
            case 1: caloriasBebida = 20; break;
            case 2: caloriasBebida = 70; break;
            case 3: caloriasBebida = 100; break;
            case 4: caloriasBebida = 65; break;
            default:
                System.out.println("Opção invalida!");
        }
        switch (sobremesa) {
            case 1: caloriasSobremesa = 75; break;
            case 2: caloriasSobremesa = 110; break;
            case 3: caloriasSobremesa = 170; break;
            case 4: caloriasSobremesa = 200; break;
            default:
                System.out.println("Opção invalida!");
        }

        int caloriasTotais = caloriasPrato + caloriasBebida + caloriasSobremesa;

        System.out.println("A sua refeição tem um total de " + caloriasTotais + " calorias");


    }
}
