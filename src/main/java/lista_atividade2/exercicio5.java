package lista_atividade2;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo(a) ao TSE!");
        System.out.println("Vamos verificar a sua classe eleitoral?");
        System.out.println("Por favor digite a sua idade: ");
        int idade = entrada.nextInt();

        if(idade <= 15){
            System.out.println("Você ainda não pode votar!");
        }else if((idade >= 16 && idade <= 17) || (idade > 70)){
            System.out.println("Seu voto não é obrigatório");
        }
        else {
            System.out.println("O seu voto é obirgatório! Por favor exerça seu direito!");
        }
    }
}
