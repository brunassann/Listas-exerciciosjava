package lista_atividade2;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo a Caixa Econômica Federal - É por você. É por um novo Brasil!");
        System.out.println("Digite o saldo médio do cliente:");
        double saldoMedio = entrada.nextDouble();
        double credito = 0;

        if(saldoMedio <= 500){
            credito = 0;
        }else if(saldoMedio <= 1000){
            credito = saldoMedio * 0.30;
        }else if(saldoMedio <= 3000){
            credito = saldoMedio * 0.40;
        }else{
            credito = saldoMedio * 0.50;
        }

        System.out.println("O saldo médio do seu cliente é de R$ " + saldoMedio);
        System.out.println("O credito disponível é de R$ " + credito);
    }
}
