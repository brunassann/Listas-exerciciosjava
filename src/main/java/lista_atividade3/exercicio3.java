package lista_atividade3;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva seu nome:");
        String nome = entrada.nextLine();

        for(int i = 1; i <= 10; i++){
            System.out.println(nome);
        }

    }
}
