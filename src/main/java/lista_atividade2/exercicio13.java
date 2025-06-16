package lista_atividade2;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo(a) a BRA Meteriologia");
        System.out.println("-------------------------------");
        System.out.println("Quantos graus Celsius (°C) está fazendo na sua cidade hoje?");
        int grausCelsius = entrada.nextInt();

        int fahrenheit = (9 * grausCelsius + 160)/5;

        System.out.println("Muito legal a temperatura em graus Celsius ser " + grausCelsius + "°C");
        System.out.println("Mas você sabia que em Fahrenheit fica " + fahrenheit + "°F");


    }
}
