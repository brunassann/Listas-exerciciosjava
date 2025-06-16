package lista_atividade3;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número par ver a tabuada: ");
        int numero = entrada.nextInt();

        System.out.println("Tabuada do" + numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
