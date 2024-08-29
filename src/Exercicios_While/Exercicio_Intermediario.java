package Exercicios_While;

/*
Faça um programa que imprima as tabelas de tabuada do número 1 até o 10. Cada tabuada deve ser separada por uma linha em
branco.
 */

public class Exercicio_Intermediario {
    public static void main(String[] args) {

        int i=1;

        while(i<=10){
            System.out.printf("Tabuada do numero %d\n", i);
            int j = 1;
            while(j<=10){
                System.out.printf("%d x %d = %d\n",i, j, i * j);
                j++;
            }
        i++;
            System.out.println();
        }
    }
}
