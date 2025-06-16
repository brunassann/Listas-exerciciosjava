package lista_atividade3;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.println("---------------------------------");
        System.out.println("Imprimindo seu nome " + numero + " vezes");

        for (int i = 1; i <= numero; i++) {
            System.out.println(i + " - " + nome);
        }
    }
}
