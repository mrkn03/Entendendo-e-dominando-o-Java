package Exercicios_Repeticao_e_Selecao;

/*
Escreva um programa que detecte e imprima na tela números múltiplos de 3. Esses números devem variar de 1 a 100.
 */

import java.util.Random;

public class Exercicio_Basico {
    public static void main(String[] args) {

    for(int i=1; i<=100;i++){
        if(i % 3 ==0){
            System.out.printf("%d, ",i);
        }
    }
    }
}
