package lista_atividade3;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroPar = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite aqui um número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                numeroPar++;
            }
        }

        System.out.println("Desse grupo " + numeroPar + " número(s) é/são par(es)!");
    }
}
