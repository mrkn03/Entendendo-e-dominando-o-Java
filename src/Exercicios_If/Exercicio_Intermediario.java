package Exercicios_If;

/*
Escreva um programa, usando if, que imprima na tela uma tabela de classificação segundo as seguintes faixas de pontuação:
De 0 a 50 pontos: Reprovado
De 51 a 75 pontos: A recuperar
De 76 a 90 pontos: Aprovado
De 91 a 100 pontos: Aprovado com louvor
Menor que 0 ou maior que 100: Pontuação inválida
 */

import java.util.Scanner;

public class Exercicio_Intermediario {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        double nota;

        System.out.print("Digite a nota de 0 a 100: ");
        nota = sc.nextDouble();

        if (nota < 0){
            System.out.println("Pontuação inválida.");
        } else if (nota <= 50) {
            System.out.println("Reprovado.");
        } else if (nota <= 75) {
            System.out.println("A recuperar.");
        } else if (nota <= 90) {
            System.out.println("Aprovado.");
        } else if (nota <= 100) {
            System.out.println("Aprovado com louvor.");
        }

        sc.close();
    }
}
