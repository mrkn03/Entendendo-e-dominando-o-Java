package Exercicios_Switch;

/*
Escreva um programa, usando if, que imprima na tela uma tabela de classificação segundo as seguintes faixas de pontuação:
50 pontos: Reprovado
75 pontos: A recuperar
90 pontos: Aprovado
100 pontos: Aprovado com louvor
Qualquer outro valor: Pontuação inválida
 */

import java.util.Scanner;

public class Exercicio_Intermediario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Digite a nota de 0 a 100: ");
        nota = sc.nextInt();

        switch (nota){
            case 50:
                System.out.println("Reprovado");
                break;
            case 75:
                System.out.println("A recuperar.");
                break;
            case 90:
                System.out.println("Aprovado.");
                break;
            case 100:
                System.out.println("Aprovado com louvor.");
                break;
            default:
                System.out.println("Pontuação inválida.");
        }

        sc.close();
    }
}
