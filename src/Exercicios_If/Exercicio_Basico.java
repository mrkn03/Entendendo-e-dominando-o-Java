package Exercicios_If;

/*
Escreva um programa que verifique se determinado número é par ou ímpar e exiba o resultado na tela. Nota: um número será
par se o resto de sua divisão por 2 for zero.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Basico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if(num % 2 == 0){
            System.out.printf("O número %.2f é par.", num);
        } else if (num % 2 != 0) {
            System.out.printf("O número %.2f é impar.", num);
        }

        sc.close();
    }
}
