package Exercicios_For;

/*
Faça um programa que imprima uma escala de temperatura de -30ºC a +45ºC, variando de 5 em 5ºC.
 */

public class Exercicio_Basico {
    public static void main(String[] args) {

        for(int i = -30; i<=45; i+=5){
            System.out.printf("%dºC ,",i);
        }

    }
}
