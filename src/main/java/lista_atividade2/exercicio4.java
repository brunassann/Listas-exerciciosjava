package lista_atividade2;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite um número:");
        int numero1 = entrada.nextInt();

        System.out.println("Agora digite outro número: ");
        int numero2 = entrada.nextInt();

        System.out.println("E por último, mais um número: ");
        int numero3 = entrada.nextInt();

        int numeroMaior;
        int numeroMedio;
        int numeroMenor;

        if(numero1 >= numero2 && numero1 >= numero3){
            numeroMaior = numero1;
            if(numero2 >= numero3){
                numeroMedio = numero2;
                numeroMenor = numero3;
            }else{
                numeroMedio = numero3;
                numeroMenor = numero2;
            }
        }else if(numero2 >= numero1 && numero2 >= numero3){
            numeroMaior = numero2;
            if(numero1 >= numero3){
                numeroMedio = numero1;
                numeroMenor = numero3;
            }else{
                numeroMedio = numero3;
                numeroMenor = numero1;
            }
        }else{
            numeroMaior = numero3;
            if(numero1 >= numero2){
                numeroMedio = numero1;
                numeroMenor = numero2;
            }else{
                numeroMedio = numero2;
                numeroMenor = numero1;
            }
        }

        System.out.println("A ordem decrescente dos números que você escolheu é: " + numeroMaior + ", " + numeroMedio + " e " + numeroMenor);


    }
}
