package Exercicios_While;

/*
Faça um programa que imprima uma escala de temperatura de -30ºC a +45ºC, variando de 5 em 5ºC.
 */

public class Exercicio_Basico {
    public static void main(String[] args) {

        int c = -30;

        while(c <= 45){
            System.out.printf("%dºC, ",c);
            c += 5;
        }

    }
}
