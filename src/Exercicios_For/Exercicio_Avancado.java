package Exercicios_For;

/*
Escreva um programa que gere, de modo randomico, 10 numeros, os quais podem variar de 1 a 100. Nota: use o código abaixo
para gerar numeros randomicamente:

int maximo = 5;
int randomico = (int) (Math.random() * maximo);
 */

public class Exercicio_Avancado {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            int maximo = 5;
            int randomico = (int) (Math.random() * maximo);

            System.out.printf("%d, ",randomico);
        }

    }
}
